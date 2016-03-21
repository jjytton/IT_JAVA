import java.util.Scanner;

public class ControlStatement07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int sum0=0,sum1=0;
		Scanner sc = new Scanner(System.in);
		for(int i=0 ; i<10 ;i++){
			System.out.print("select month >> ");
			n=sc.nextInt();
			if(n%2==0) sum0+=n;
			else sum1+=n;
		}
		System.out.println("Â¦¼ö ÇÕ = "+sum0);
		System.out.println("È¦¼ö ÇÕ = "+sum1);
		
	}

}
