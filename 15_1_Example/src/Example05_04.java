// 사용자에게 정수 3개를 입력받아 총점과 평균을 출력하는 
// 프로그램을 작성 하세요.
import java.util.Scanner;
public class Example05_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		double avg;
		
		System.out.print("첫 번째 성적을 입력하세요 : ");
		sum += sc.nextInt();
		System.out.print("두 번째 성적을 입력하세요 : ");
		sum += sc.nextInt();
		System.out.print("세 번째 성적을 입력하세요 : ");
		sum += sc.nextInt();
		
		avg = (double)sum / 3;
		
		System.out.printf(
				"입력된 성적의 총점은 %d, 평균은 %.2f 점 입니다.\n", 
				sum, avg);

	}

}
