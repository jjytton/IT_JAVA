//사용자에게 정수 2개를 입력 받아 1번째 입력한 정수부터 2번째 입력된 정수까지의 
// 합계를 출력하는 프로그램을 작성하세요.
// 첫 번째 입력된 수가 두 번째 입력한 수보다 클 경우 프로그램은 종료됩니다.
import java.util.Scanner;
public class Example07_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input01, input02;
		
		System.out.print("첫 번째 정수를 입력하세요 : ");
		input01 = sc.nextInt();
		System.out.print("두 번째 정수를 입력하세요 : ");
		input02 = sc.nextInt();
		
		if( input01 > input02 ) {
			System.out.println(
					"첫 번째 정수는 두 번째 정수보다 값이 작아야 합니다.\n");
			return;
		}
		
		int sum = 0;
		for( int i = input01 ; i <= input02 ; i++ )
			sum += i;
		
		System.out.printf("%d 정수와 %d 정수 사이의 합계는 %d 입니다.\n",
				input01, input02, sum);
	}
}
