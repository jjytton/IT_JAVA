import java.util.Scanner;

public class Exercis03 {
	public static void main(String args[]){
		int i;
		int n;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("select >> ");
		n=sc.nextInt();
		for(i=0 ; i<=100 ; i++){
			if(i%n==0) sum+=i;
		}
		System.out.println(n+"의 배수 총합은  "+sum);	}
}
