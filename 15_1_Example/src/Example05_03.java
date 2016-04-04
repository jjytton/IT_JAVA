// 사용자에게 아이디와 패스워드를 입력 받은 후,
// 아이디가 100, 패드워드가 12345 일 경우 로그인 성공,
// 아닐 경우 로그인 실패를 출력하세요.
// 아이디와 패드워드는 모두 정수입니다.
import java.util.Scanner;
public class Example05_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int id, password;
		
		System.out.print("아이디를 입력하세요 : ");
		id = sc.nextInt();
		System.out.print("패스워드를 입력하세요 : ");
		password = sc.nextInt();
		
		boolean flag;
		String result;
		
		flag = id == 100;
		flag = flag && password == 12345;
		
		if( flag )
			result = "로그인 성공";
		else
			result = "로그인 실패";
		
		System.out.println(result);

	}

}
