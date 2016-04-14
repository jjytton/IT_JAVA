//인터페이스
//다형성의 구현과 다중 상속을 위해 사용되는 문법
// public static final 필드만 가질수잇음(일반 멤버필드,생성자,일반멤버메소드 X)
// public abstract 메소드만 가질수있음
interface Inter02{
	public final static int number=1000;
	abstract public void disp2();
}
interface Inter03{
	public final static int number=1000;
	abstract public void disp3();
}
interface Inter04{
	public final static int number=1000;
	abstract public void disp4();
}
class InterSub02 implements Inter02,Inter03,Inter04{

	@Override
	public void disp4() {
		// TODO Auto-generated method stub
		System.out.println(4);
	}

	@Override
	public void disp3() {
		// TODO Auto-generated method stub
		System.out.println(3);
	}

	@Override
	public void disp2() {
		// TODO Auto-generated method stub
		System.out.println(2);
	}
	
}
public class Interface02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//인터페이스 객체를 못만드는 이유
		//1.생성자를 만들수 없음
		//2.추상메소드 포함가능성
		Inter02 i1=new InterSub02();
		Inter03 i2=new InterSub02();
		Inter04 i3=new InterSub02();
		
		i1.disp2();
		i2.disp3();
		i3.disp4();
		
	}

}
