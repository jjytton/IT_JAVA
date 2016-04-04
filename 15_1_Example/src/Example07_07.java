// 1 ~ 100 사이의 정수 중 소수를 출력하는 프로그램을 작성하세요.
// 소수 : 1과 자기 자신외에 나누어 떨어지지 않는 수
public class Example07_07 {
	public static void main(String[] args) {
	
		boolean flag;
		
		for( int i = 1 ; i <= 100 ; i++ ) {
			
			flag = true;
			
			for( int j = 2 ; j <= (i - 1) ; j++ ) {
				if( i % j == 0 ) {
					flag = false;
					break;
				}
			}
			
			if( flag )
				System.out.println(i);
		}

	}
}


