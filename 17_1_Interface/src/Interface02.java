//�������̽�
//�������� ������ ���� ����� ���� ���Ǵ� ����
// public static final �ʵ常 ����������(�Ϲ� ����ʵ�,������,�Ϲݸ���޼ҵ� X)
// public abstract �޼ҵ常 ����������
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
		//�������̽� ��ü�� ������� ����
		//1.�����ڸ� ����� ����
		//2.�߻�޼ҵ� ���԰��ɼ�
		Inter02 i1=new InterSub02();
		Inter03 i2=new InterSub02();
		Inter04 i3=new InterSub02();
		
		i1.disp2();
		i2.disp3();
		i3.disp4();
		
	}

}
