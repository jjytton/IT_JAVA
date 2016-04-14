import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO06 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fin=null;
		FileOutputStream fout=new FileOutputStream("c:\\test.out");
		
		try {
			for(int i=0 ; i<10 ; i++){
				int n=10-i;
				fout.write(n);
			}
			fout.close();
			fin=new FileInputStream("c:\\test.out");
			int c=0;
			while((c=fin.read())!=-1){
				System.out.print(c+" ");
			}
			fin.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
