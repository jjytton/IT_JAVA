class StaticB{
	public static int cnt=0;
	public StaticB() {
		// TODO Auto-generated constructor stub
		cnt++;
		System.out.println("Ŭ������ ��ü�� "+cnt+"�� �����Ǿ����ϴ�.");
	}
}
public class Static02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticB s1=new StaticB();
		StaticB s2=new StaticB();
		StaticB s3=new StaticB();
		StaticB s4=new StaticB();
		StaticB s5=new StaticB();
		StaticB s6=new StaticB();
		
	}

}
