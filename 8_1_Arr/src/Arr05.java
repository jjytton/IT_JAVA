import java.util.Scanner;

public class Arr05 {
	public static void main(String args[]) {
		int[][] arr;
		arr = new int[3][5];
		int cnt = 10;
		for (int i = 0; i < arr.length; ++i) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = cnt++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);
			}
		}
	}
}
