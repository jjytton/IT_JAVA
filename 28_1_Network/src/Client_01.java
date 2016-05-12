
import java.io.IOException;
import java.net.*;
public class Client_01 {
	public static void main(String [] args) {
		// 동일한 PC에서의 통신 시, 주소는 
		// localhost 또는 127.0.0.1 을 사용할 수 있습니다.
		try {
			
			System.out.println("클라이언트 소켓 생성");
			Socket s = new Socket("localhost", 5010);
			System.out.println("클라이언트 소켓 연결 성공");
			
		} catch (UnknownHostException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
}
