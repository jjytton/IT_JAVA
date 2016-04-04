// 사용자에게 1-12 사이의 정수를 입력 받아 해당 달의 일수를 
// 출력하는 프로그램을 작성하세요.
// switch  구문을 사용해서 작성하세요
import java.util.Scanner;
public class Example06_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int month;
		int day;
		
		System.out.print("1 ~ 12 사이의 정수를 입력하세요 : ");
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
			System.out.printf("%d 월은 %d 일 까지 있습니다.\n", month, day);
		else
			System.out.println("입력이 잘못되었습니다.");
	}
}
