import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.LinkedList;

import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeNode;

import lib.db.DataBaseInfo;

public class test {
	public static void main(String[] args) {
		test_Frame tf = new test_Frame();

	}
}

class test_Frame3 extends JDialog {
	JLabel jlb = new JLabel("");
	GridLayout gl = new GridLayout(2, 1);
	JPanel jp = new JPanel(new FlowLayout());
	JButton bt = new JButton("확인");
	test_Frame f = null;

	public test_Frame3(test_Frame f, String str) {
		this.f = f;
		this.setLayout(gl);
		this.add(jlb);
		this.add(jp);
		jp.add(bt);
		bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
			}
		});
		jlb.setText(str.toString());

		
		
		// this.setLocationRelativeTo(f);
		this.setSize(200, 150);
		Toolkit tk = Toolkit.getDefaultToolkit(); // 구현된 Toolkit객체를 얻는다.
		Dimension screenSize = tk.getScreenSize();// 화면의 크기를 구한다.
		int x_l = screenSize.width / 2 - this.getWidth() / 2;
		// y좌표구하기
		int y_l = screenSize.height / 2 - this.getHeight() / 2;

		setLocation(x_l, y_l); // 구한 좌표로 위치 지정
		this.setModal(true);
		this.getRootPane().setDefaultButton(bt);
		this.setVisible(true);

	}
}

class test_Frame2 extends JDialog {
	DBInfo dbinfo = null;
	test_Frame f = null;
	JButton bt = new JButton("접속");
	private JLabel jid = new JLabel("id : ", Label.LEFT);
	private JLabel jpw = new JLabel("pw : ", Label.LEFT);
	private JTextField jt_login = new JTextField();
	private JTextField jt_passwd = new JTextField();
	private BorderLayout bl = new BorderLayout();
	private GridLayout gl = new GridLayout(2, 2);
	private JPanel jc = new JPanel(gl);

	public test_Frame2(test_Frame f, DBInfo dbinfo) {
		this.f = f;
		this.dbinfo = dbinfo;
		jt_login.setText(this.dbinfo.id);
		jt_passwd.setText(this.dbinfo.pw);
		jc.add(jid);
		jc.add(jt_login);
		jc.add(jpw);
		jc.add(jt_passwd);
		bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// new test_Frame3("aa");
				// System.out.println("aa");
				dbinfo.id = new String(jt_login.getText());
				dbinfo.pw = new String(jt_passwd.getText());
				dbinfo.ConnectOracleDB();
				dbinfo.b=true;
				setVisible(false);
				new test_Frame3(f, "  Success to Connect DB");
				dispose();
			}
		});
		Toolkit tk = Toolkit.getDefaultToolkit(); // 구현된 Toolkit객체를 얻는다.
		Dimension screenSize = tk.getScreenSize();// 화면의 크기를 구한다.

		// this.setLocationRelativeTo(null);
		this.getRootPane().setDefaultButton(bt);
		this.setLayout(bl);
		this.add("Center", jc);
		this.add("South", bt);
		this.setSize(200, 100);
		int x_l = screenSize.width / 2 - this.getWidth() / 2;
		// y좌표구하기
		int y_l = screenSize.height / 2 - this.getHeight() / 2;
		setLocation(x_l, y_l); // 구한 좌표로 위치 지정
		this.setModal(true);
		this.setVisible(true);

	}
}

class DBInfo {
	String id = new String("scott");
	String pw = new String("tiger");
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	DataBaseInfo info = new DataBaseInfo("DataBaseInfo.properties");
	boolean b=false;
	public DBInfo() {
		// TODO Auto-generated constructor stub

	}

	public void ConnectOracleDB() {
		String driver = info.readProperties("DATABASE_DRIVER");
		String url = info.readProperties("DATABASE_URL");
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("DB connection complete");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public LinkedList<String> getTreeNodeList() {
		LinkedList<String> nodes=null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("Select table_name From tabs");
			nodes=new LinkedList<String>();
			// ResultSet 객체의 정보 추출
			ResultSetMetaData rsmd = rs.getMetaData();
			// getColumnCount 메소드 : ResultSet 객체가 // 현재 보관하고 있는 컬럼의 개수를 리턴
			int nColumns = rsmd.getColumnCount();
			//System.out.println(nColumns);
			while (rs.next()) {
				String name = rs.getString(1);
				nodes.add(name);
				//System.out.println(name);
			}
			
			rs.close();
			stmt.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return nodes;
	}
	public DefaultTableModel getRecordsTable(String tablename){
		JTable table=null;
		DefaultTableModel dtm=null;
		try{
			ArrayList<String> columnNames=new ArrayList<String>();
			String[][] tabledata=null;
			int row=0;
			stmt=conn.createStatement();
			String query="select count(*) from "+tablename;
			rs=stmt.executeQuery(query);
			
			if(rs.next()) row=rs.getInt(1);
			
			query="select * from "+tablename;
			System.out.println(query);
			rs=stmt.executeQuery(query);
			ResultSetMetaData data=rs.getMetaData();
		
			for(int i=1 ; i< data.getColumnCount()+1 ; i++){
				columnNames.add(data.getColumnName(i));
				//System.out.println(data.getColumnName(i));
			}
			if(row==0){
				dtm=new DefaultTableModel(null,columnNames.toArray());
				return dtm;
			}
			tabledata=new String[row][data.getColumnCount()];
			//System.out.println(tabledata.length);
			//System.out.println(data.getColumnCount());
			int i=0;
			while(rs.next()){
				for(int j=0 ; j<data.getColumnCount() ; j++){
					//System.out.println(i+","+j);
					tabledata[i][j]=rs.getString(j+1);
				}
				i++;
			}
			dtm=new DefaultTableModel(tabledata,columnNames.toArray());
			//table=new JTable(dtm);
		}
		catch(SQLException e3){
			e3.printStackTrace();
		}
		return dtm;
	}
	public DefaultTableModel getDescribeTable(String tablename){
		JTable table=null;
		DefaultTableModel dtm=null;
		try{
			ArrayList<String> columnNames=new ArrayList<String>();
			String[][] tabledata=null;
			int row=0;
			stmt=conn.createStatement();
			String query="SELECT count(*) FROM all_tab_columns where table_name = '"+tablename+"'";
			rs=stmt.executeQuery(query);
			
			if(rs.next()) row=rs.getInt(1);
			if(row==0)return null;
			query="SELECT column_name,data_type,data_length,nullable FROM all_tab_columns where table_name = '"+tablename+"'";
			rs=stmt.executeQuery(query);
			System.out.println(query);
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
			//table=new JTable(dtm);
			
		}
		catch(SQLException e3){
			e3.printStackTrace();
		}
		return dtm;
	}
	
	
	public void close() {
		try {
			if (rs != null)
				rs.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class test_Frame extends JFrame {

	JMenuBar jmb = new JMenuBar();
	JMenu jmFile = new JMenu("Run");
	JMenuItem mitem_fNew = new JMenuItem("Login");
	JMenuItem mitem_fExit = new JMenuItem("Exit");
	DBInfo dbinfo = new DBInfo();
	JSplitPane split = new JSplitPane();
	DefaultMutableTreeNode root=new DefaultMutableTreeNode("TABLE LIST");
	JTree tree=new JTree(root);
	JTabbedPane tabbedPane=new JTabbedPane();
	
	JTable jt_records=new JTable();
	JTable jt_describe=new JTable();
	JScrollPane js_records;
	JScrollPane js_describe;
	JPanel jp_records=new JPanel();
	JPanel jp_describe=new JPanel();
	boolean b=false;
	String tablename=null;
	
	public test_Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("DATABASE Viewer");
		this.setJMenuBar(jmb);
		jmb.add(jmFile);
		jmFile.add(mitem_fNew);
		jmFile.addSeparator();
		jmFile.add(mitem_fExit);

		split.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
		this.getContentPane().add(split, "Center");
		
		resetComponent();
		js_records=new JScrollPane(jt_records,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		js_describe=new JScrollPane(jt_describe,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		jp_records.setLayout(new BorderLayout());
		jp_records.add(js_records,"Center");
		jp_describe.setLayout(new BorderLayout());
		jp_describe.add(js_describe,"Center");
		split.setLeftComponent(tree);
		
		//jp_records.add(js_records);
		//jp_describe.add(js_describe);
		tabbedPane.add("Records", jp_records);
		tabbedPane.add("Describe", jp_describe);	
		
		split.setRightComponent(tabbedPane);
		split.setDividerLocation(150);
		split.setDividerSize(3);
		this.setSize(640, 520);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		TestListenr listener = new TestListenr(this); // 아래의 컴포넌트 리스너 클래스 생성

		mitem_fExit.addActionListener(listener);
		mitem_fNew.addActionListener(listener);

	}
	private void resetComponent(){
		root=new DefaultMutableTreeNode("TABLE LIST");
		tree=new JTree(root);
		split.setLeftComponent(tree);
		split.setDividerLocation(150);
		split.setDividerSize(3);
		
		resetTables();
	}
	private void resetTables() {
		// TODO Auto-generated method stub
		String []columnNames=new String[1];
		columnNames[0]="NO DATA";
		String[][] tabledata=new String[1][1];
		tabledata[0][0]="NO DATA";
		DefaultTableModel dtm=new DefaultTableModel(tabledata,columnNames);
		jt_records.setModel(dtm);
		jt_describe.setModel(dtm);
		
	}
	private void updateComponent(){
		root=new DefaultMutableTreeNode(dbinfo.id.toUpperCase()+"'s TABLE LIST");
		LinkedList<String>nodes =dbinfo.getTreeNodeList();
		for(int i=0 ; i<nodes.size() ; i++){
			root.add(new DefaultMutableTreeNode(nodes.get(i)));
		}
		tree=new JTree(root);
	
		tree.addTreeSelectionListener(new TreeSelectionListener() {
			
			@Override
			public void valueChanged(TreeSelectionEvent e) {
				
				// TODO Auto-generated method stub
					tablename=e.getPath().getLastPathComponent().toString();
					if(tablename==null){
						return;
					}
					System.out.println(e.getPath().getLastPathComponent());
					//System.out.println(tabbedPane.getSelectedIndex());
					//updateTables(e.getPath().getLastPathComponent().toString());
					if(tabbedPane.getSelectedIndex()==0){
						updateRecordsTable(tablename);
					}else{
						updateDescribeTable(tablename);
					}
					System.out.println("aa");
					repaint();
			}

			
		});
		tabbedPane.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				if(tablename==null){
					System.out.println("tablename null");
					return;
				}
				System.out.println(e.getSource().getClass().getTypeName());
				if(tabbedPane.getSelectedIndex()==0){
					updateRecordsTable(tablename);
				}else{
					updateDescribeTable(tablename);
				}
				System.out.println("dd");
				repaint();
			}
		});
		/*
		tabbedPane.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				if(tablename==null){
					System.out.println("tablename null");
					return;
				}
				System.out.println(e.getSource().getClass().getTypeName());
				if(tabbedPane.getSelectedIndex()==0){
					updateRecordsTable(tablename);
				}else{
					updateDescribeTable(tablename);
				}
				System.out.println("cc");
				repaint();
			}
		});
		*/
		split.setLeftComponent(tree);
		split.setDividerLocation(150);
		split.setDividerSize(3);
	}
	private void updateTables(String tablename) {
		// TODO Auto-generated method stub
		updateRecordsTable(tablename);
		updateDescribeTable(tablename);
	}
	private void updateRecordsTable(String tablename) {
		// TODO Auto-generated method stub
		DefaultTableModel dtm=dbinfo.getRecordsTable(tablename);
		jt_records.setModel(dtm);
		
	}
	private void updateDescribeTable(String tablename) {
		// TODO Auto-generated method stub
		DefaultTableModel dtm=dbinfo.getDescribeTable(tablename);
		if(dtm!=null){
			jt_describe.setModel(dtm);
		}else{
			resetTables();
			
		}
	}
	class TestListenr implements ActionListener {
		test_Frame f = null;

		public TestListenr(test_Frame f) {
			// TODO Auto-generated constructor stub
			this.f = f;
		}

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource() == mitem_fExit) { // 이벤트가 ExitItem이라면
				System.exit(1); // '종료' 선택시 프로그램 종료
			} else if (e.getSource() == mitem_fNew) {
				if (mitem_fNew.getText().equals("Login")) {
					new test_Frame2(f, dbinfo);
					if(dbinfo.b==false)return;
					mitem_fNew.setText("Logout");
					updateComponent();
					
				} else {
					dbinfo = new DBInfo();
					mitem_fNew.setText("Login");
					resetComponent();
					resetTables();
					tablename=null;
				}

			}
		}
	}
}
