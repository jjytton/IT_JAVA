import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO09 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		System.out.print("메세지를 입력하세요 :");
		String msg=br.readLine();
		
		System.out.println(msg);
		br.close();
	}

}
