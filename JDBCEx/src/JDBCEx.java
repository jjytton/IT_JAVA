import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class JDBCEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		ResultSetMetaData rsmd=null;
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		String id="scott";
		String passwd="tiger";
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection(url, id, passwd);
			System.out.println("DB Connect sucx");
			stmt=conn.createStatement();
			rs=stmt.executeQuery("select * from emp order by empno");
			rsmd=rs.getMetaData();
			
			int colc=rsmd.getColumnCount();
			for(int i=0 ; i<colc ; i++){
				System.out.printf("%8s ",rsmd.getColumnName(i+1));
			}
			System.out.println();
			
			while(rs.next()){
				int empno=rs.getInt(1);
				String ename=rs.getString(2);
				String job=rs.getString(3);
				String mgr=rs.getString(4);
				String hiredate=rs.getString(5);
				int sal=rs.getInt(6);
				double domm=rs.getDouble(7);
				int deptno=rs.getInt(8);
				System.out.printf("%8d %8s %8s %8s %8s %8d %.2f %8d\n"
						,empno,ename,job,mgr,hiredate,sal,domm,deptno);
			}
			rs.close();
			stmt.close();
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
