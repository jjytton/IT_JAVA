import java.util.Scanner;

public class Exercis10 {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int max=0,min=0;
		int i=1;
		int n;
		while(i<=10){
			System.out.print("점수를 입력하세요 : ");
			n=sc.nextInt();
			
			if(i==1){
				max=min=n;
			}else{
				if(n > max) max=n;
				if( n < min) min=n;
			}
			i++;
		}
		System.out.println("최대 값  "+max+", 최소값 : "+min);
	}
}
