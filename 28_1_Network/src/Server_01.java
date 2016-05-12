

import java.io.IOException;
import java.net.*;

public class Server_01 {
	public static void main(String [] args) {
		try {				
			ServerSocket ss = new ServerSocket(5010);
			System.out.println("辑滚 家南 积己");
			
			System.out.println("辑滚 家南 accept() 角青 吝");
			Socket client = ss.accept();
			System.out.println("辑滚 家南 accept() 角青 饶");
			
			System.out.println("努扼捞攫飘 家南 积己");
			
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
}





