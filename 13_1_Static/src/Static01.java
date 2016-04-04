class StaticA{
	int num1;
	public static int num2=30;
}
public class Static01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticA s=new StaticA();
		
		s.num1=10;
		s.num2=20;
		
		System.out.println(s.num1);
		System.out.println(s.num2);
		
		StaticA.num2=100;
		System.out.println(StaticA.num2);
		
		System.out.println(s.num2);
		
		StaticA s2=new StaticA();
		System.out.println(s.num2);
	}

}
