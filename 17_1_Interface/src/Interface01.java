//�������̽�
//�������� ������ ���� ����� ���� ���Ǵ� ����
// public static final �ʵ常 ����������(�Ϲ� ����ʵ�,������,�Ϲݸ���޼ҵ� X)
// public abstract �޼ҵ常 ����������
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
		//�������̽� ��ü�� ������� ����
		//1.�����ڸ� ����� ����
		//2.�߻�޼ҵ� ���԰��ɼ�
		Inter01 i=new InterSub01();
		i.disp();
	}

}
