// 사용자에게 정수 1개를 입력 받아 짝수/홀수 여부를 출력하세요.
import java.util.Scanner;
public class Example05_02 {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		int input;
		String result;
		
		System.out.print("정수를 입력하세요 : ");
		input = sc.nextInt();
		
		if( input % 2 == 0 )
			result = "짝수";
		else
			result = "홀수";
		
		System.out.printf("%d 정수는 %s 입니다.\n", input, result);
	}
}
