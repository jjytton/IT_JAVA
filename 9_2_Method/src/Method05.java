import java.util.Scanner;

public class Method05 {

	public static int sum(int a,int b){
		return a+b;
	}
	public static int max(int a,int b,int c){
		int max=a;
		if(max < b) max=b;
		if(max < c) max=c;
		return max;
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
		int c=sum(10,20);

		System.out.println("c ="+c);
		int max=max(n[0],n[1],n[2]);
		System.out.println("max ="+max);
	}

}
