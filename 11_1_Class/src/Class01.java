import java.util.Scanner;

public class Class01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("덧셈을 수행할 두 개의 숫자를 입력 : ");
		int n=sc.nextInt();
		int m=sc.nextInt();
		Sum s = new Sum();
		System.out.println(n+"부터 "+m+" 까지의 합 : "+s.allsum(n, m));
		System.out.println(n+"부터 "+m+" 까지의 짝수합 : "+s.evensum(n, m));
		System.out.println(n+"부터 "+m+" 까지의 홀수합 : "+s.oddsum(n, m));
		
	}

}
