import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO08 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fin=null;
		FileOutputStream fout=new FileOutputStream("c:\\test2.out");
		
		try {
			int n;
			System.out.println("입력 시작");
			do{
				n=System.in.read();
				if(n=='n' || n=='N') break;
				System.in.read();
				System.in.read();
				fout.write(n);
			}while( true );
			System.out.println("입력 끝");
			fout.close();
			System.out.println("출력 시작");
			fin=new FileInputStream("c:\\test2.out");
			int c=0;
			while((c=fin.read())!=-1){
				System.out.print((char)c);
			}
			fin.close();
			System.out.println();
			System.out.println("출력 끝");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
