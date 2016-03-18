
public class ControlStatement04 {

	public final static int ID=71359;
	public final static int PW=3519723;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id=71359;
		int pw=33;
		
		if(id==ID && pw ==PW){
			System.out.println("login 성공");
		}else{
			System.out.println("login 실패");
		}
		int menu=13;
		if(menu==1){
			System.out.println("select 한식");
		}else if(menu==2){
			System.out.println("select 중식");
		}else if(menu==3){
			System.out.println("select 일식");
		}else {
			System.out.println("잘못된 선택");
		}
	}

}
