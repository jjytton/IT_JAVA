import java.util.Scanner;

public class DoWhile02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		do{
			System.out.print("프로그램을 종료하려면 1000을 입력 : ");
		}while(sc.nextInt()!=1000);
	}

}
