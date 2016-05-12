
import java.sql.*;
public class Database03 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		DataBaseInfo info = 
			new DataBaseInfo("DataBaseInfo.properties");
		
		String driver = info.readProperties(
				"DATABASE_DRIVER");
		String url = info.readProperties(
				"DATABASE_URL");
		String id = info.readProperties(
				"DATABASE_ID");
		String pw = info.readProperties(
				"DATABASE_PASSWORD");
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(
					url, id, pw);
			System.out.println("DB connection complete");

			stmt = conn.createStatement();				
			rs = stmt.executeQuery(
					"Select * From Actor");
			
			// ResultSet 객체의 정보 추출
			ResultSetMetaData rsmd = rs.getMetaData();
			// getColumnCount 메소드 : ResultSet 객체가
			// 현재 보관하고 있는 컬럼의 개수를 리턴
			int nColumns = rsmd.getColumnCount();
			
			for( int i = 1 ; i <= nColumns ; i++ )
				// getColumnLabel 메소드 
				// ResultSet 객체가 보관하는 컬럼의 이름을 리턴
				// 인덱스는 1부터 시작
				System.out.printf(
					"%s\t", rsmd.getColumnLabel(i));
			
			System.out.println();			
			
			while (rs.next()) {	
				for( int i = 1 ; i <= nColumns ; i++ )
					System.out.printf("%s\t", 
							rs.getObject(i));
				
				System.out.println();
			}			
			
			// 직전의 레코드가 ResultSet의 시작지점인지 확인
			while( !rs.isBeforeFirst() )
				// 커서를 직전의 레코드로 이동
				rs.previous();			
			
			while (rs.next()) {				
				int number = rs.getInt(1);
				String name = rs.getString(2);
				System.out.printf(
						"%d : %s\n", number, name);				
			}
			
			rs.close();
			stmt.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
