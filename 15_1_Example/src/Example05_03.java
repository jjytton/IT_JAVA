// ����ڿ��� ���̵�� �н����带 �Է� ���� ��,
// ���̵� 100, �е���尡 12345 �� ��� �α��� ����,
// �ƴ� ��� �α��� ���и� ����ϼ���.
// ���̵�� �е����� ��� �����Դϴ�.
import java.util.Scanner;
public class Example05_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int id, password;
		
		System.out.print("���̵� �Է��ϼ��� : ");
		id = sc.nextInt();
		System.out.print("�н����带 �Է��ϼ��� : ");
		password = sc.nextInt();
		
		boolean flag;
		String result;
		
		flag = id == 100;
		flag = flag && password == 12345;
		
		if( flag )
			result = "�α��� ����";
		else
			result = "�α��� ����";
		
		System.out.println(result);

	}

}
