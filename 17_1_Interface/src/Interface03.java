//인터페이스
//다형성의 구현과 다중 상속을 위해 사용되는 문법
// public static final 필드만 가질수잇음(일반 멤버필드,생성자,일반멤버메소드 X)
// public abstract 메소드만 가질수있음
interface Inter05{
	abstract public void methodI();
}
abstract class SuperE{
	abstract public void methodC();
}
class InterSub03 extends SuperE implements Inter05{

	@Override
	public void methodI() {
		// TODO Auto-generated method stub
		System.out.println("I");
	}

	@Override
	public void methodC() {
		// TODO Auto-generated method stub
		System.out.println("C");
	}
}
public class Interface03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterSub03 i=new InterSub03();
		i.methodC();
		i.methodI();
		
		Inter05 i1=new InterSub03();
		i1.methodI();
		SuperE i2=new InterSub03();
		i2.methodC();
		
	}

}
