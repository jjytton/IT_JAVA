
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
			
			// ResultSet ��ü�� ���� ����
			ResultSetMetaData rsmd = rs.getMetaData();
			// getColumnCount �޼ҵ� : ResultSet ��ü��
			// ���� �����ϰ� �ִ� �÷��� ������ ����
			int nColumns = rsmd.getColumnCount();
			
			for( int i = 1 ; i <= nColumns ; i++ )
				// getColumnLabel �޼ҵ� 
				// ResultSet ��ü�� �����ϴ� �÷��� �̸��� ����
				// �ε����� 1���� ����
				System.out.printf(
					"%s\t", rsmd.getColumnLabel(i));
			
			System.out.println();			
			
			while (rs.next()) {	
				for( int i = 1 ; i <= nColumns ; i++ )
					System.out.printf("%s\t", 
							rs.getObject(i));
				
				System.out.println();
			}			
			
			// ������ ���ڵ尡 ResultSet�� ������������ Ȯ��
			while( !rs.isBeforeFirst() )
				// Ŀ���� ������ ���ڵ�� �̵�
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
