import java.util.Scanner;

public class Class01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("������ ������ �� ���� ���ڸ� �Է� : ");
		int n=sc.nextInt();
		int m=sc.nextInt();
		Sum s = new Sum();
		System.out.println(n+"���� "+m+" ������ �� : "+s.allsum(n, m));
		System.out.println(n+"���� "+m+" ������ ¦���� : "+s.evensum(n, m));
		System.out.println(n+"���� "+m+" ������ Ȧ���� : "+s.oddsum(n, m));
		
	}

}
