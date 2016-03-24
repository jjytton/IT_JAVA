import java.util.Scanner;

public class Arr02 {
	public static void main(String args[]) {
		int[] num = new int [4];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<num.length-1;i++){
			System.out.print("성적을 입력하세요 :" );
			num[i]=sc.nextInt();
			num[3]+=num[i];
			
		}
		
		double avg = (double)num[3]/3;
		System.out.println("평균 : "+avg);
	}
}
