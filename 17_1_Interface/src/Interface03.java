//�������̽�
//�������� ������ ���� ����� ���� ���Ǵ� ����
// public static final �ʵ常 ����������(�Ϲ� ����ʵ�,������,�Ϲݸ���޼ҵ� X)
// public abstract �޼ҵ常 ����������
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
