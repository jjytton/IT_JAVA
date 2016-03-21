import java.util.Scanner;

public class ControlStatement08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		for(int i=0 ;  ;i++){
			System.out.print("select month >> ");
			n=sc.nextInt();
			if(n==100) break;
		}
		sc.close();
		
	}

}
