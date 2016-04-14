//인터페이스
//다형성의 구현과 다중 상속을 위해 사용되는 문법
// public static final 필드만 가질수잇음(일반 멤버필드,생성자,일반멤버메소드 X)
// public abstract 메소드만 가질수있음
interface Inter01{
	public final static int number=1000;
	abstract public void disp();
}
class InterSub01 implements Inter01{

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		System.out.println(number);
	}
	
}
public class Interface01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//인터페이스 객체를 못만드는 이유
		//1.생성자를 만들수 없음
		//2.추상메소드 포함가능성
		Inter01 i=new InterSub01();
		i.disp();
	}

}
