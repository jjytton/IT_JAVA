import java.io.IOException;

public class IO04 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int num1,num2,sum=0;
		try {
			//기본 입력 버퍼에서 1바이트 읽어옴
			System.out.print("첫번째 정수를 입력하세요 : ");
			num1=System.in.read()-'0';
			sum+=num1;
			System.in.read();
			System.in.read();
			System.out.print("두번째 정수를 입력하세요 : ");
			num2=System.in.read()-'0';
			sum+=num2;
			System.out.println(num1+" + "+num2+" = "+(num1+num2));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
