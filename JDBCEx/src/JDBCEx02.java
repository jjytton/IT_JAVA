import java.io.UnsupportedEncodingException;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class JDBCEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root",
					"SystemManager");
			System.out.println("DB ���� �Ϸ�");
			Statement stmt = stmt = conn.createStatement();
			//stmt.executeUpdate("insert into student (name, id, dept) values('" + new String("�ƹ���".getBytes())
			//		 + "', '0893012', '" + new String("��ǻ�Ͱ���".getBytes()) +"');");

			ResultSet srs = stmt.executeQuery("select * from student");
			printData(srs, "name", "id", "dept");
			stmt.executeUpdate("update student set id='0189011' where name='"+ new String("�ƹ���".getBytes(), "ISO-8859-1") +"'");
			printTable(stmt);
			
			//srs = stmt.executeQuery("select name, id, dept from student where name='"
			//		+ new String("�̱���".getBytes(), "ISO-8859-1") + "'");
			
			//printData(srs, "name", "id", "dept");

			
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC ����̹� �ε� ����");
		} catch (SQLException e) {
			System.out.println("SQL ���� ����");
		} catch (UnsupportedEncodingException e) {
			System.out.println("�������� �ʴ� ���ڵ� Ÿ��");
		}

	}

	private static void printData(ResultSet srs, String col1, String col2, String col3)
			throws UnsupportedEncodingException, SQLException {
		while (srs.next()) {
			if (!col1.equals(""))
				System.out.print(new String(srs.getString("name")));
			if ((!col2.equals("")))
				System.out.print("\t|\t" + srs.getString("id"));
			if ((!col3.equals("")))
				System.out.println("\t|\t" + new String(srs.getString("dept")));
			else
				System.out.println();
		}
	}
	private static void printTable(Statement stmt) throws SQLException, UnsupportedEncodingException {
		ResultSet srs = stmt.executeQuery("select * from student");
		while (srs.next()) {
			System.out.print(new String(srs.getString("name")));
			System.out.print("\t|\t" + srs.getString("id"));
			System.out.println("\t|\t" + new String(srs.getString("dept")));
		}
	}
}
