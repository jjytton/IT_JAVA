import java.util.Scanner;

public class ScannerTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.print("int input >> ");
		int i=sc.nextInt();
		System.out.println("i == "+i);
		
		System.out.print("float input >> ");
		float f=sc.nextFloat();
		System.out.println("f == "+f);
		
		sc.nextLine();
		System.out.print("String input >> ");
		String s=sc.nextLine();
		System.out.println("s == "+s);
	}

}
