import java.util.Scanner;

public class Method06 {

	public static void inputSubject(int[] n) {
		Scanner sc=new Scanner(System.in);
		for(int i=0 ; i<n.length;i++){
			System.out.print("input >>");
			n[i]=sc.nextInt();
		}
	}

	public static void displaySubject(int[] n) {
		for(int i=0 ; i<n.length;i++)
			System.out.println("n["+i+"] = "+n[i]);
		int total=getSubjectTotal(n);
		double avg=getSubjectAvg(n);
		System.out.println("total = "+total+" , "+"avg = "+avg);
	}

	private static double getSubjectAvg(int[] n) {
		// TODO Auto-generated method stub
		
		return (double)getSubjectTotal(n)/n.length;
	}

	private static int getSubjectTotal(int[] n) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int n1 : n){
			sum+=n1;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[] = new int[3];
		inputSubject(n);
		displaySubject(n);
	}

}
