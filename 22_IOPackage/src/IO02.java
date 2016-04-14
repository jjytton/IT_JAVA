import java.io.IOException;

public class IO02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		try {
			//기본 입력 버퍼에서 1바이트 읽어옴
			System.out.print("1바이트 입력 : ");
			num=System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("읽어온 값 : "+num);
		System.out.println("읽어온 값 : "+(char)num);
		
	}

}
