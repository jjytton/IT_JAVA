// ����ڿ��� 1-12 ������ ������ �Է� �޾� �ش� ���� �ϼ��� 
// ����ϴ� ���α׷��� �ۼ��ϼ���.
// switch  ������ ����ؼ� �ۼ��ϼ���
import java.util.Scanner;
public class Example06_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int month;
		int day;
		
		System.out.print("1 ~ 12 ������ ������ �Է��ϼ��� : ");
		month = sc.nextInt();
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;
		case 2:
			day = 28;
			break;
		default:
			day = -1;
		}
		
		if (day != -1)
			System.out.printf("%d ���� %d �� ���� �ֽ��ϴ�.\n", month, day);
		else
			System.out.println("�Է��� �߸��Ǿ����ϴ�.");
	}
}
