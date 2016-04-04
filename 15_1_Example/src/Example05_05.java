// 문제 4에서 작성한 프로그램을 수정하여, 
// 평균이 90점 이상일 경우 A, 80점 이상일 경우 B, 
// 70점 이상일 경우 C, 60점 이상일 경우 D, 
// 그 외의 경우는 F로 평가하는 프로그램을 작성하세요.
import java.util.Scanner;
public class Example05_05 {
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
		
		char result;
		if( avg > 100 || avg < 0 )
			result = '?';
		else if( avg >= 90 )
			result = 'A';
		else if( avg >= 80 )
			result = 'B';
		else if( avg >= 70 )
			result = 'C';
		else if( avg >= 60 )
			result = 'D';
		else 
			result = 'F';
		
		if( result == '?' )
			System.out.println("입력된 성적을 확인하세요.");
		else
			System.out.printf("입렫된 성적의 평가는 '%c' 입니다.\n",
					result);
	}

}
