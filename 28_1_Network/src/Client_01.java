
import java.io.IOException;
import java.net.*;
public class Client_01 {
	public static void main(String [] args) {
		// ������ PC������ ��� ��, �ּҴ� 
		// localhost �Ǵ� 127.0.0.1 �� ����� �� �ֽ��ϴ�.
		try {
			
			System.out.println("Ŭ���̾�Ʈ ���� ����");
			Socket s = new Socket("localhost", 5010);
			System.out.println("Ŭ���̾�Ʈ ���� ���� ����");
			
		} catch (UnknownHostException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
}
