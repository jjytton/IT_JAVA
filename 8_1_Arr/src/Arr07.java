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
		System.out.print("�л� ���� �Է��ϼ��� : ");
		studentNum = sc.nextInt();
		System.out.print("���� ���� �Է��ϼ��� : ");
		n = sc.nextInt();
		arr = new int[studentNum][n];
		score = new int[studentNum];
		for (int i = 0; i < studentNum; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%d��° �л��� %d��° ������ �Է��ϼ��� : ", i + 1, j + 1);
				arr[i][j] = sc.nextInt();
				score[i]+=arr[i][j];
			}

		}
		for (int i = 0; i < studentNum; i++) {
			System.out.printf("%d��° �л��� ������ %d, ����� %.0f�� �Դϴ�\n", i + 1, score[i], (double)(score[i]/n));

		}

	}
}
