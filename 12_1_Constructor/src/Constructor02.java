import java.util.Scanner;

class P{
	int i;
	float f;
	public P(){
		Scanner sc=new Scanner(System.in);
		System.out.print(" �� ���� �Է��ϼ��� : ");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		System.out.println("�� ���� ���� "+(n1+n2));
	}
}
public class Constructor02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P p=new P();
	}

}
