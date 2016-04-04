// 사용자에게 정수 1개를 입력 받아 해당 정수의 
// 구구단을 출력하는 프로그램을 작성하세요.
import java.util.Scanner;
public class Example07_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input;
		System.out.print("정수를 입력해 주세요 : ");
		input = sc.nextInt();
		
		for( int i = 1 ; i <= 9 ; i++ ) {
			System.out.printf("%d * %d = %d\n", 
					input, i, input * i);
		}

	}

}
