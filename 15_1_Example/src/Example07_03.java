// ����ڿ��� ���� 1���� �Է� �޾� 1���� �Է��� �������� �հ踦 ����ϴ� 
// ���α׷��� �ۼ��ϼ���.
// ������ �Էµ� ��� ���α׷��� ����˴ϴ�.
import java.util.Scanner;
public class Example07_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.print("������ �Է��ϼ��� : ");
		int input;
		input = sc.nextInt();
		
		if( input < 0 ) {
			System.out.println("������ �ԷµǾ� ���α׷��� �����մϴ�.");
			return;
		}
		
		int sum = 0;
		for( int i = 1 ; i <= input ; i++ )
			sum += i;
		
		System.out.printf("1���� �Էµ� %d ������ �հ�� %d �Դϴ�.\n", 
				input, sum);
			
	}
}
