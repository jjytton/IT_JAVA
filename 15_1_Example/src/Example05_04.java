// ����ڿ��� ���� 3���� �Է¹޾� ������ ����� ����ϴ� 
// ���α׷��� �ۼ� �ϼ���.
import java.util.Scanner;
public class Example05_04 {
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

	}

}
