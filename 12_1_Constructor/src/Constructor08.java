import java.util.Scanner;
class MemberService{
	private String id="hong";
	private String password="12345";
	public boolean login(String id,String password){
		if(this.id.equals(id) && this.password.equals(password))
			return true;
		return false;
	}
	public void logout(String id){
		if(this.id.equals(id)) System.out.println("로그아웃 되었습니다");
		else System.out.println("회원이 아닙니다");
	}
}
public class Constructor08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberService m=new MemberService();
		boolean b=m.login("hong", "12345");
		if(b){
			System.out.println("로그인 되었습니다");
			m.logout("hong");
		}else{
			System.out.println("아이디 또는 패스워드가 올바르지 않습니다");
		}
		
	}

}
