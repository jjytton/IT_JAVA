// ����ڿ��� ���� 5���� �Է� �޾� 
// �ִ밪, �ּҰ�, �հ踦 ����ϴ� ���α׷��� �ۼ��ϼ���.
import java.util.Scanner;
public class Example07_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		int max = 0, min = 0, sum = 0;		
		
		for( int i = 1 ; i <= 5 ; i++ ) {
			System.out.printf("%d ��° ������ �Է��ϼ��� : ");
			input = sc.nextInt();
			sum += input;
			
			if( i == 1 )
				max = min = input;
			else {
				if( input > max )
					max = input;
				if( input < min )
					min = input;
			}
		}
		
		System.out.printf("�Է��� ���� �� ���� ū ���� %d,", max);
		System.out.printf("�Է��� ���� �� ���� ���� ���� %d,", min);
		System.out.printf("�Է��� ������ �հ�� %d,", sum);

	}

}
