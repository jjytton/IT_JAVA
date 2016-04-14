import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO07 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		char []msg=new char[20];
		InputStreamReader isr=new InputStreamReader(System.in);
		
		System.out.print("메세지를 입력하세요 :");
		int size=isr.read(msg);
		
		System.out.println("읽어온 문자의 개수는 "+size);
		System.out.println();
		
		for(int i=0 ; i<msg.length ;i++){
			System.out.print(msg[i]+" ");
		}
		
		System.out.println();
		System.out.println();
		
		for(int i= 0 ; i<msg.length ; i++){
			System.out.print((char)msg[i]);
		}
		
	}

}
