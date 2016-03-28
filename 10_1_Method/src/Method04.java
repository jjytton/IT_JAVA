import java.util.Scanner;

public class Method04 {

	public static int getStudentNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�л� ���� �Է��ϼ��� : ");
		return sc.nextInt();
	}

	public static int getSubjectNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� �Է��ϼ��� : ");
		return sc.nextInt();
	}

	public static void input(int[] score) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < score.length; i++) {
			do {
				System.out.print((i + 1) + "��° ������ �Է��ϼ��� : ");
				score[i] = sc.nextInt();
			} while (score[i] < 0 || score[i] > 100);
		}
	}

	public static void input(int[][] score) {
		for (int i = 0; i < score.length; i++) {
			System.out.println((i + 1) + "��° �л� ������ �Է��մϴ�");
			input(score[i]);
		}
	}

	public static int getTotal(int[] score) {
		int total = 0;
		for (int n : score) {
			total += n;
		}
		return total;
	}

	public static double getAvg(int[] score) {
		return (double) getTotal(score) / score.length;
	}

	public static void output(int[][] score) {
		System.out.println("==================");
		System.out.println("������ ����մϴ�");
		System.out.println("==================");

		for (int i = 0; i < score.length; i++) {
			System.out.printf("%d ��° �л� ���� %d�� ��� %.2f�� �Դϴ�\n",i+1,getTotal(score[i]),getAvg(score[i]));
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[][]=new int[getStudentNumber()][getSubjectNumber()];
		input(score);
		output(score);
	}

}
