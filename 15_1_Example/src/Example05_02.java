// ����ڿ��� ���� 1���� �Է� �޾� ¦��/Ȧ�� ���θ� ����ϼ���.
import java.util.Scanner;
public class Example05_02 {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		int input;
		String result;
		
		System.out.print("������ �Է��ϼ��� : ");
		input = sc.nextInt();
		
		if( input % 2 == 0 )
			result = "¦��";
		else
			result = "Ȧ��";
		
		System.out.printf("%d ������ %s �Դϴ�.\n", input, result);
	}
}
