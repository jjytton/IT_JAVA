//����ڿ��� ���� 2���� �Է� �޾� 1��° �Է��� �������� 2��° �Էµ� ���������� 
// �հ踦 ����ϴ� ���α׷��� �ۼ��ϼ���.
// ù ��° �Էµ� ���� �� ��° �Է��� ������ Ŭ ��� ���α׷��� ����˴ϴ�.
import java.util.Scanner;
public class Example07_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input01, input02;
		
		System.out.print("ù ��° ������ �Է��ϼ��� : ");
		input01 = sc.nextInt();
		System.out.print("�� ��° ������ �Է��ϼ��� : ");
		input02 = sc.nextInt();
		
		if( input01 > input02 ) {
			System.out.println(
					"ù ��° ������ �� ��° �������� ���� �۾ƾ� �մϴ�.\n");
			return;
		}
		
		int sum = 0;
		for( int i = input01 ; i <= input02 ; i++ )
			sum += i;
		
		System.out.printf("%d ������ %d ���� ������ �հ�� %d �Դϴ�.\n",
				input01, input02, sum);
	}
}
