import java.io.FileInputStream;
import java.io.IOException;

public class IO05 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream in=null;
		try {
			in=new FileInputStream("c:\\windows\\system.ini");
			int c = 0;
			while((c=in.read())!=-1){
				System.out.print((char)c);
			}
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
