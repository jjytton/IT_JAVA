

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

public class Client_02 extends JFrame implements Runnable {
	JTextField tfIpNumber;
	JTextField tfPortNumber;
	JTextField tfMessage;
	JButton btnExecute;
	JButton btnSend;
	JTextArea taText;

	Socket client;

	BufferedReader br;
	PrintWriter pw;

	Client_02 object;

	public Client_02() {
		object = this;
		setTitle("클라이언트 프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		Container c = this.getContentPane();
		this.tfIpNumber = new JTextField("localhost", 10);
		this.tfPortNumber = new JTextField("7577", 5);
		this.btnExecute = new JButton("서버연결");
		this.btnExecute.addActionListener(new BtnExecuteHanddler());

		JPanel upSide = new JPanel();
		upSide.setLayout(new FlowLayout());
		upSide.add(this.tfIpNumber);
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
	
	public void setClient() {
		new Thread(this).start();	
	}

	class BtnExecuteHanddler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			setClient();
		}
	}

	class BtnSendHanddler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String strSendMassage = tfMessage.getText();
			pw.println(strSendMassage);
			taText.append("Client : " + strSendMassage + "\n");
			tfMessage.setText("");
		}
	}

	public void run() {
		String strIp = tfIpNumber.getText();
		String strPort = tfPortNumber.getText();
		try {
			client = new Socket(strIp, Integer.parseInt(strPort));
			taText.append("서버에 접속하였습니다.\n");
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
		
		String strMessage;		
		try {
			while (true) {
				strMessage = br.readLine();
				taText.append("Server : " + strMessage + "\n");
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Client_02();
	}
}
