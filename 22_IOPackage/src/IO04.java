import java.io.IOException;

public class IO04 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int num1,num2,sum=0;
		try {
			//�⺻ �Է� ���ۿ��� 1����Ʈ �о��
			System.out.print("ù��° ������ �Է��ϼ��� : ");
			num1=System.in.read()-'0';
			sum+=num1;
			System.in.read();
			System.in.read();
			System.out.print("�ι�° ������ �Է��ϼ��� : ");
			num2=System.in.read()-'0';
			sum+=num2;
			System.out.println(num1+" + "+num2+" = "+(num1+num2));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
