import java.util.Scanner;

public class DoWhile03 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int balance = 0;
		int n;
		do{
			System.out.println("===========================");
			System.out.println("1.���� 2.��� 3.�ܰ� 4.����");
			System.out.println("===========================");

			System.out.print("select >> ");
			n = sc.nextInt();

			switch (n) {
			case 1:
				System.out.print("���ݾ��� �Է��ϼ��� : ");
				balance+=sc.nextInt();
				break;
			case 2:
				System.out.print("��ݾ��� �Է��ϼ��� : ");
				balance-=sc.nextInt();

				break;
			case 3:
				System.out.println("balance = " + balance);
				break;
			case 4:
				run = false;
				break;
			default:
				System.out.println("����� �Է��Ͻÿ�");
			}

		}while(run);
		System.out.println("���α׷� ����");
	}
}
