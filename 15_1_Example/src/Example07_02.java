// For 반복문을 사용해 1 ~ 500 사이의 정수 중, 
// 3과 5의 배수의 합계를 출력하는 프로그램을 작성하세요.
public class Example07_02 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		for( int i = 1 ; i <= 500 ; i++ ) {
			if( i % 3 == 0 && i % 5 == 0 )
				sum += i;
		}
		
		System.out.printf(
				"1 ~ 500 사이의 정수 중 3과 5의 배수의 합은 %d 입니다.\n", 
				sum);		
	}
}
