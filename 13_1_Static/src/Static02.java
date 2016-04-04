class StaticB{
	public static int cnt=0;
	public StaticB() {
		// TODO Auto-generated constructor stub
		cnt++;
		System.out.println("클래스의 객체가 "+cnt+"개 생성되었습니다.");
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
