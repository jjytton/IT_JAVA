import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.DefaultTableModel;
class JDBC_sub extends JFrame implements ActionListener{
	private BorderLayout bl = new BorderLayout();
	private JPanel jp1=new JPanel(new GridLayout(1,1)); //���ϴ�
	private JPanel jp2=new JPanel(new GridLayout(1,1)); //����
	private JPanel jp3=new JPanel(new GridLayout(1,1)); //���
	private JPanel jp4=new JPanel(new GridLayout(4,1)); //���� ����
	private JPanel jp5=new JPanel(new GridLayout(4,1)); //���� ������
	
	private JPanel jp7=new JPanel(new FlowLayout(FlowLayout.LEFT)); //�� ������ ���� �÷ο췹�̾ƿ� ����гε�
	private JPanel jp8=new JPanel(new FlowLayout(FlowLayout.LEFT)); 
	private JPanel jp9=new JPanel(new FlowLayout(FlowLayout.LEFT)); 
	private JPanel jp10=new JPanel(new FlowLayout(FlowLayout.LEFT)); 
	
	private JLabel db_url = new JLabel("DB URL : ", Label.LEFT);
	private JLabel login = new JLabel("Login : ", Label.LEFT);
	private JLabel passwd = new JLabel("Passwd : ", Label.LEFT);
	private JLabel table_name = new JLabel("���̺� �̸� : ", Label.LEFT);
	private JButton jbt1=new JButton("����");
	
	private JTextField jt_db_url=new JTextField();
	private JTextField jt_login=new JTextField();
	private JTextField jt_passwd=new JTextField();
	private JTextField jt_table_name=new JTextField();
	
	private Connection con=null;
	private Statement stmt=null;
	private ResultSet rs=null;
	private String url;
	private String user;
	private String pwd;
	private String tablename;
	
	ArrayList<String> columnNames;
	private DefaultTableModel dtm;
	private JTable table;
	private JScrollPane jp;
	
	JDBC_sub(){
		super("DB Browser");
		this.init();
		this.start();
		this.setSize(600, 400);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm = this.getSize();
		int xpos = (int) (screen.getWidth() / 2 - frm.getWidth() / 2);
		int ypos = (int) (screen.getHeight() / 2 - frm.getHeight() / 2);
		this.setLocation(xpos, ypos);
		this.setVisible(true);
	}

	private void init() {
		
		this.setLayout(bl);
		
		this.add("South", jp1);
		jp1.add(jbt1);
		
		this.add("North", jp2);
		jp2.add(jp4);
		jp2.add(jp5);
		
		this.add("Center",jp3);
		
		jp4.add(jp7);
		jp4.add(jp8);
		jp4.add(jp9);
		jp4.add(jp10);
	
		jp7.add(db_url);
		jp8.add(login);
		jp9.add(passwd);
		jp10.add(table_name);

		jp5.add(jt_db_url);
		jp5.add(jt_login);
		jp5.add(jt_passwd);
		jp5.add(jt_table_name);
		
	}
	private void start() {
		jbt1.addActionListener(this);//�����ư
		
	}	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==jbt1){
			if(jt_db_url.getText().trim().equals("") || 
					jt_login.getText().trim().equals("") ||
					jt_passwd.getText().trim().equals("") ||
					jt_table_name.getText().trim().equals("") ){
				System.out.println("�Է� ������ �ùٸ��� �ʽ��ϴ�");
				return;
			}
			else{
				url = "jdbc:mysql://"+jt_db_url.getText().trim();
				user = jt_login.getText().trim();
				pwd = jt_passwd.getText().trim();
				tablename = jt_table_name.getText().trim();
				try{
					Class.forName("org.gjt.mm.mysql.Driver");
					System.out.println("Driver ���� ����!");

				}catch(ClassNotFoundException e1){
					System.out.println("Driver ���� ����!");
				}
				try{
					con = DriverManager.getConnection(url, user, pwd);
					System.out.println("My-SQL ���� ����!!");
				}catch(SQLException e1){
					System.out.println("My-SQL ���� ����!!");
				}
				try{
					if(table!=null){ 
						jp3.remove(jp);
					}
					columnNames=new ArrayList<String>();
					String[][] tabledata=null;
					int row=0;
					stmt=con.createStatement();
					String query="select count(*) from "+tablename;
					rs=stmt.executeQuery(query);
					
					if(rs.next()) row=rs.getInt(1);
					query="select * from "+tablename;
					rs=stmt.executeQuery(query);
					ResultSetMetaData data=rs.getMetaData();
					for(int i=1 ; i< data.getColumnCount()+1 ; i++){
						columnNames.add(data.getColumnName(i));
					}
					tabledata=new String[row][data.getColumnCount()];
					int i=0;
					while(rs.next()){
						for(int j=0 ; j<data.getColumnCount() ; j++){
							tabledata[i][j]=rs.getString(j+1);
						}
						i++;
					}
					dtm=new DefaultTableModel(tabledata,columnNames.toArray());
					table=new JTable(dtm);
					table.setSize(600, 350);
					jp = new JScrollPane(table);
					jp.setPreferredSize(new Dimension(600, 250));
					jp3.add(jp);
					setVisible(true);
				}
				catch(SQLException e3){
					e3.printStackTrace();
				}
				finally{
					try{
						if(stmt!=null) stmt.close();
						if(con!=null) con.close();
						if(rs!=null) rs.close();
					}
					catch(SQLException e4){
						e4.printStackTrace();
					}
				}
				
			}
		}
	}
}


public class JDBC{

	public static void main(String[] args) {
		JDBC_sub ex=new JDBC_sub();
	}
}
