import java.net.*;
import java.io.*;
public class URLRead {
    public static void main(String[] args) {
    		try {
				// URL ��ü ����
    			URL aURL = new URL("http://www.nate.com"); 

			// URL ��ü���� �Է� ��Ʈ�� ����
	    		BufferedReader in = 
						new BufferedReader(new InputStreamReader(
														aURL.openStream())); 
	    		String inputLine;
	
    			while ((inputLine = in.readLine()) != null) // ���� �� ����
    				System.out.println(inputLine);
	    		in.close();
	    	} catch (IOException e) {
    			System.out.println("URL���� �����͸� �д� �� ������ �߻��߽��ϴ�.");
	    	}
	}
}
