// ����ڿ��� ������ �Է� �޾� ¦��/Ȧ�� ���θ� �Ǻ��ϴ� 
// ���α׷��� �ۼ��ϼ���.
// switch  ������ ����ؼ� �ۼ��ϼ���
import java.util.Scanner;
public class Example06_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input;		
		
		System.out.print("������ �Է��ϼ��� : ");
		input = sc.nextInt();
		
		switch( input % 2 ) {
		case 0:
			System.out.printf("%d �� ¦�� �Դϴ�.\n", input);
			break;
		case 1:
			System.out.printf("%d �� Ȧ�� �Դϴ�.\n", input);
			break;
		}
	}
}
