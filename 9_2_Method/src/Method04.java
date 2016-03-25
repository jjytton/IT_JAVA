import java.util.Scanner;

public class Method04 {

	public static void method1(int n[]){
		n[0]=33;
	}
	public static void input(int n[]){
		Scanner sc=new Scanner(System.in);
		for(int i=0 ; i<n.length;i++){
			System.out.print("input >>");
			n[i]=sc.nextInt();
		}
	}
	public static void output(int n[]){
		for(int i=0 ; i<n.length;i++)
			System.out.println("n["+i+"] = "+n[i]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[]=new int[3];
		input(n);
		output(n);
		method1(n);
		input(n);
		output(n);
	}

}
