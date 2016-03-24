import java.util.Scanner;

public class Arr06 {
	public static void main(String args[]) {
		int [][]arr;
		arr=new int[3][2];
		
		arr[1][0]=10;
		
		for(int i= 0 ; i<arr.length;i++){
			for(int j=0 ; j<arr[i].length;j++){
				System.out.println("arr["+i+"]["+j+"] = "+arr[i][j]);
			}
		}
	}
}
