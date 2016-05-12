
//������ ���̽��� �����ϴ� �������� ������ �� �ִ� API ��Ű��
import java.sql.*;
public class Database01 {

	public static void main(String[] args) {
		// Connection Ŭ����
		// ������ ���̽��� ������ ���� ����ϴ� Ŭ����
		Connection conn = null;
		// ���� ���ڿ��� �����ϰ�, �����ͺ��̽��� �����ϴ� Ŭ����
		Statement stmt = null;
		// ������ ���(Select ��)�� �޾ƿ��� Ŭ����
		ResultSet rs = null;
		// ������ ����� ���� �÷� �����͸� �޾ƿ� �� �ִ� Ŭ����
		ResultSetMetaData rsmd = null;
		// JDBC : Java DataBase Connector
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		// "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
		String id = "scott";
		String pw = "tiger";

		try {
			// ���� Ŭ���� �ε� �޼ҵ�
			// �ڹ��� �⺻ ��Ű���ܿ� �ܺ� ��Ű�����ο� ���Ե�
			// Ŭ������ ����ϱ� ���� ����ϴ� ���
			// Class.forName("Ŭ�������̸�(��Ű��������)");
			// forName�� ����Ǹ� �ش� Ŭ���� ������ STATIC
			// ���/�޼ҵ�/���� �ڵ� �ε�/����˴ϴ�.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// DriverManager
			// �����ϰ��� �ϴ� �����ͺ��̽��� URL, ID, PASSWORD
			// ������ ����� Ŀ�ؼ��� ������ Ŭ����
			conn = DriverManager.getConnection(url, id, pw);

			System.out.println("DB connection complete");

			// ������ ������ �� �ִ� ��ü ����
			stmt = conn.createStatement();
			// Statement.executeQuery �޼ҵ�
			// Select ���� ó���ϱ� ���� �޼ҵ�
			// ���������� ����ȴٸ�, ó���� ����� ���̺��� ������
			// ResultSet ��ü�� �����Ͽ� ��ȯ�մϴ�.
			rs = stmt.executeQuery(
					"select * from EMP Order by EMPNO");

			rsmd = rs.getMetaData();
			// �÷��� ��
			int columnCnt = rsmd.getColumnCount();
			for (int i = 1; i <= columnCnt; i++) {
				// �÷��� ���
				System.out.printf("%8s ", rsmd.getColumnName(i));
			}
			System.out.println();
			
			// ResultSet ��ü�� ������ ��ȸ�ϴ� ���
			while (rs.next()) {
				int empno = rs.getInt(1);
				String ename = rs.getString(2);
				String job = rs.getString(3);
				String mgr = rs.getString(4);
				String hiredate = rs.getString(5);
				int sal = rs.getInt(6);
				double domm = rs.getDouble(7);
				int deptno = rs.getInt(8);
				System.out.printf("%8d %8s %8s %8s %8s %8d, %.2f, %8d\n", 
						empno, ename, job, mgr, 
						hiredate, sal, domm, deptno);
			}
			// ��ü�� ���� ����
			rs.close();
			stmt.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
