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
		if(this.id.equals(id)) System.out.println("�α׾ƿ� �Ǿ����ϴ�");
		else System.out.println("ȸ���� �ƴմϴ�");
	}
}
public class Constructor08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberService m=new MemberService();
		boolean b=m.login("hong", "12345");
		if(b){
			System.out.println("�α��� �Ǿ����ϴ�");
			m.logout("hong");
		}else{
			System.out.println("���̵� �Ǵ� �н����尡 �ùٸ��� �ʽ��ϴ�");
		}
		
	}

}
