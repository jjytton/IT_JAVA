import java.util.Scanner;

public class DoWhile03 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int balance = 0;
		int n;
		do{
			System.out.println("===========================");
			System.out.println("1.예금 2.출금 3.잔고 4.종료");
			System.out.println("===========================");

			System.out.print("select >> ");
			n = sc.nextInt();

			switch (n) {
			case 1:
				System.out.print("예금액을 입력하세요 : ");
				balance+=sc.nextInt();
				break;
			case 2:
				System.out.print("출금액을 입력하세요 : ");
				balance-=sc.nextInt();

				break;
			case 3:
				System.out.println("balance = " + balance);
				break;
			case 4:
				run = false;
				break;
			default:
				System.out.println("제대로 입력하시오");
			}

		}while(run);
		System.out.println("프로그램 종료");
	}
}
