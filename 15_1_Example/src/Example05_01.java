public class Example05_01 {
	public static void main(String [] args) {
		int number = 10;

		// number 변수의 짝수/홀수 여부를 판단하여
		// 짝수/홀수를 출력하세요
		if( number % 2 == 0 )
			System.out.printf("%d 는 짝수 입니다.", number);
		else
			System.out.printf("%d 는 홀수 입니다.", number);
	}
}