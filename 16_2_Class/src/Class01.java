final class FianlA {
}

// ��� ����
// class FinalB extends FinalA{}
class FinalC {
	public final void Disp() {
		System.out.println("FinalC.Disp");
	}
}

//
/*
 * class FinalD extends FinalC{ public final void Disp(){
 * System.out.println("FinalC.Disp"); 
 * } 
 * }
 */
class FinalE{
	public int num1;
	public int num2=2;
	//�ݵ�� �ʱ�ȭ�� �ʿ��� fianl
	//1. ��� ����� ���ÿ� 
	//2. �����ڷ� �ʱ�ȭ 
	//�� ���ִµ� 1�� ������ ���� ���� ��� 
	//2�� �ٸ� ���� ���� ���� ���
	public final int num3=30;
	public final int num4;
	
	public FinalE(int num4){
		this.num4=num4;
		
	}
}
class Const{
	public static final int ARRAY_SIZE=100;
}
class Color{
	public static final int RED=0;
	public static final int BLUE=1;
	public static final int GREEN=2;
}
public class Class01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[Const.ARRAY_SIZE];
		System.out.println(Const.ARRAY_SIZE);
		
		int s=1;
		switch (s) {
		case Color.RED:
			break;
		case Color.BLUE:
			break;
		case Color.GREEN:
			break;
		default:
			break;
		}
	}

}
