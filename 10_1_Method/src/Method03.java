import java.util.Scanner;

public class Method03 {

	private static void methodTest(int ...a){
		int sum=0;
		for( int n : a){
			sum+=n;
		}
		System.out.println("sum = "+sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodTest(10);
		methodTest(10,20);
		methodTest(10,20,30);
		methodTest(10,20,30,40);
		methodTest(10,20,30,40,50);
		
		
	}

}
