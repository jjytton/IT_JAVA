import java.io.IOException;

public class IO02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		try {
			//�⺻ �Է� ���ۿ��� 1����Ʈ �о��
			System.out.print("1����Ʈ �Է� : ");
			num=System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("�о�� �� : "+num);
		System.out.println("�о�� �� : "+(char)num);
		
	}

}
