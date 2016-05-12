
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;

public class Server_02 extends JFrame implements Runnable {
	JTextField tfPortNumber;
	JTextField tfMessage;
	JButton btnExecute;
	JButton btnSend;
	JTextArea taText;
	ServerSocket ss;
	Socket client;

	BufferedReader br;
	PrintWriter pw;

	public Server_02() {
		setTitle("서버 프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		Container c = this.getContentPane();
		this.tfPortNumber = new JTextField("7577", 5);
		this.btnExecute = new JButton("서버실행");

		this.btnExecute.addActionListener(new BtnExecuteHanddler());

		JPanel upSide = new JPanel();
		upSide.setLayout(new FlowLayout());
		upSide.add(this.tfPortNumber);
		upSide.add(this.btnExecute);
		c.add(upSide, BorderLayout.NORTH);

		this.taText = new JTextArea("", 20, 50);
		c.add(this.taText, BorderLayout.CENTER);

		this.tfMessage = new JTextField(15);		
		this.btnSend = new JButton("전송");
		this.btnSend.addActionListener(new BtnSendHanddler());

		JPanel downSide = new JPanel();
		downSide.setLayout(new FlowLayout());
		downSide.add(this.tfMessage);
		downSide.add(this.btnSend);
		c.add(downSide, BorderLayout.SOUTH);

		this.setSize(350, 350);
		this.setVisible(true);
	}

	public void setServer() {
		new Thread(this).start();
	}

	class BtnExecuteHanddler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			setServer();
		}
	}

	class BtnSendHanddler implements ActionListener {
		public void actionPerformed(ActionEvent e) {			
			String strSendMassage = tfMessage.getText();
			pw.println(strSendMassage);
			taText.append("Server : " + strSendMassage + "\n");
			tfMessage.setText("");
		}
	}

	public void run() {
		String strPort = tfPortNumber.getText();
		try {				
			ss = new ServerSocket(Integer.parseInt(strPort));
			taText.append("서버 ACCEPT...\n");
			client = ss.accept();
			taText.append("클라이언트가 접속했습니다.\n");			

			br = new BufferedReader(
					new InputStreamReader(
							client.getInputStream()));
			pw = new PrintWriter(
					new BufferedWriter(
							new OutputStreamWriter(
									client.getOutputStream())), true);
		} catch (NumberFormatException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		try {
			String strClientName = 
					this.client.getInetAddress().getHostName();
			String strMessage;
			while (true) {
				strMessage = br.readLine();
				taText.append(strClientName + " : " + strMessage + "\n");
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Server_02();
	}
}
