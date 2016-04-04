// 사용자에게 정수 5개를 입력 받아 
// 최대값, 최소값, 합계를 출력하는 프로그램을 작성하세요.
import java.util.Scanner;
public class Example07_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		int max = 0, min = 0, sum = 0;		
		
		for( int i = 1 ; i <= 5 ; i++ ) {
			System.out.printf("%d 번째 정수를 입력하세요 : ");
			input = sc.nextInt();
			sum += input;
			
			if( i == 1 )
				max = min = input;
			else {
				if( input > max )
					max = input;
				if( input < min )
					min = input;
			}
		}
		
		System.out.printf("입려된 정수 중 가장 큰 값은 %d,", max);
		System.out.printf("입려된 정수 중 가장 작은 값은 %d,", min);
		System.out.printf("입려된 정수의 합계는 %d,", sum);

	}

}
