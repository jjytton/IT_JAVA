// ���� 4���� �ۼ��� ���α׷��� �����Ͽ�, 
// ����� 90�� �̻��� ��� A, 80�� �̻��� ��� B, 
// 70�� �̻��� ��� C, 60�� �̻��� ��� D, 
// �� ���� ���� F�� ���ϴ� ���α׷��� �ۼ��ϼ���.
import java.util.Scanner;
public class Example05_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		double avg;
		
		System.out.print("ù ��° ������ �Է��ϼ��� : ");
		sum += sc.nextInt();
		System.out.print("�� ��° ������ �Է��ϼ��� : ");
		sum += sc.nextInt();
		System.out.print("�� ��° ������ �Է��ϼ��� : ");
		sum += sc.nextInt();
		
		avg = (double)sum / 3;
		
		System.out.printf(
				"�Էµ� ������ ������ %d, ����� %.2f �� �Դϴ�.\n", 
				sum, avg);
		
		char result;
		if( avg > 100 || avg < 0 )
			result = '?';
		else if( avg >= 90 )
			result = 'A';
		else if( avg >= 80 )
			result = 'B';
		else if( avg >= 70 )
			result = 'C';
		else if( avg >= 60 )
			result = 'D';
		else 
			result = 'F';
		
		if( result == '?' )
			System.out.println("�Էµ� ������ Ȯ���ϼ���.");
		else
			System.out.printf("�Ԏ��� ������ �򰡴� '%c' �Դϴ�.\n",
					result);
	}

}
