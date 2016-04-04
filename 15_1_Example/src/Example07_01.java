// For 반복문을 사용해 1 ~ 100 까지의 정수 중, 
// 3과 5의 배수를 출력하는 프로그램을 작성하세요.
public class Example07_01 {
	public static void main(String[] args) {
	
		for( int i = 1 ; i <= 100 ; i++ ) {
			if( i % 3 == 0 && i % 5 == 0 )
				System.out.println(i);
		}
		
	}
}
