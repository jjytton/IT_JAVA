import java.util.Scanner;

public class Arr07 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int arr[][];
		boolean run = true;
		int studentNum = 0;
		int score[] = null;
		int n;
		int min = 0, max = 0, sum = 0;
		double avg = 0;
		System.out.print("학생 수를 입력하세요 : ");
		studentNum = sc.nextInt();
		System.out.print("과목 수를 입력하세요 : ");
		n = sc.nextInt();
		arr = new int[studentNum][n];
		score = new int[studentNum];
		for (int i = 0; i < studentNum; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%d번째 학생의 %d번째 성적을 입력하세요 : ", i + 1, j + 1);
				arr[i][j] = sc.nextInt();
				score[i]+=arr[i][j];
			}

		}
		for (int i = 0; i < studentNum; i++) {
			System.out.printf("%d번째 학생의 총점은 %d, 평균은 %.0f점 입니다\n", i + 1, score[i], (double)(score[i]/n));

		}

	}
}
