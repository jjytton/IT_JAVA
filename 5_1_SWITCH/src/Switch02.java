import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("select month >> ");
		n=sc.nextInt();
		
		switch(n){
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("31");
			break;
		case 2:
			System.out.println("28");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("30");
			break;
		default :
			System.out.println("default!!");
		}
		sc.close();
	}

}
