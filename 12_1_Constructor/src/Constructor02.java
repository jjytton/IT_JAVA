import java.util.Scanner;

class P{
	int i;
	float f;
	public P(){
		Scanner sc=new Scanner(System.in);
		System.out.print(" 두 수를 입력하세요 : ");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		System.out.println("두 수의 합은 "+(n1+n2));
	}
}
public class Constructor02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P p=new P();
	}

}
