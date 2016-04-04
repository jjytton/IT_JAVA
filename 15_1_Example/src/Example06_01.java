// 사용자에게 정수를 입력 받아 짝수/홀수 여부를 판별하는 
// 프로그램을 작성하세요.
// switch  구문을 사용해서 작성하세요
import java.util.Scanner;
public class Example06_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input;		
		
		System.out.print("정수를 입력하세요 : ");
		input = sc.nextInt();
		
		switch( input % 2 ) {
		case 0:
			System.out.printf("%d 는 짝수 입니다.\n", input);
			break;
		case 1:
			System.out.printf("%d 는 홀수 입니다.\n", input);
			break;
		}
	}
}
