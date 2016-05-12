import java.io.*;
import java.net.*;
public class URLConnectionReader {
	public static void main(String[] args) {
    	try {
			// URL ��ü ����
    		URL aURL = new URL("http://www.daum.net"); 
			
			// URL ��ü���� URLConnection ��ü ����
	    	URLConnection uc = aURL.openConnection(); 
    		BufferedReader in =
			new BufferedReader(new InputStreamReader(
								uc.getInputStream())); // �Է� ��Ʈ�� ����
		  	String inputLine;
        
    	   	while ((inputLine = in.readLine()) != null) // ���� �� ����
       	 		System.out.println(inputLine);
       			in.close();
		} catch (IOException e) {
			System.out.println("URL���� �����͸� �д� �� ������ �߻��߽��ϴ�.");
		}
	}
}
