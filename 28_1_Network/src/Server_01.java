

import java.io.IOException;
import java.net.*;

public class Server_01 {
	public static void main(String [] args) {
		try {				
			ServerSocket ss = new ServerSocket(5010);
			System.out.println("���� ���� ����");
			
			System.out.println("���� ���� accept() ���� ��");
			Socket client = ss.accept();
			System.out.println("���� ���� accept() ���� ��");
			
			System.out.println("Ŭ���̾�Ʈ ���� ����");
			
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
}





