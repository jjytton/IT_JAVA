import java.util.Scanner;

public class Exercis08 {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n;
		int sum=0;
		for(int i=0 ; i<10 ;i++){
			System.out.print("insert >> ");
			n=sc.nextInt();
			if(n%2==0)continue;
			
			sum+=n;
		}
		System.out.println("홀수의 합은 "+sum);
	}
}
