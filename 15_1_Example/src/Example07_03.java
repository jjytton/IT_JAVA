// 사용자에게 정수 1개를 입력 받아 1에서 입력한 수까지의 합계를 출력하는 
// 프로그램을 작성하세요.
// 음수가 입력될 경우 프로그램은 종료됩니다.
import java.util.Scanner;
public class Example07_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.print("정수를 입력하세요 : ");
		int input;
		input = sc.nextInt();
		
		if( input < 0 ) {
			System.out.println("음수가 입력되어 프로그램을 종료합니다.");
			return;
		}
		
		int sum = 0;
		for( int i = 1 ; i <= input ; i++ )
			sum += i;
		
		System.out.printf("1부터 입력된 %d 까지의 합계는 %d 입니다.\n", 
				input, sum);
			
	}
}
