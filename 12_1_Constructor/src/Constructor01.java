class A{
	int i;
	float f;
	public A(){
		System.out.println("A default 생성자 호출");
	}
	public A(String s){
		System.out.println(s+" A String 생성자 호출");
	}
	public void display(){
		System.out.println("i = "+i+" , f = "+f);
	}
}
public class Constructor01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		a.i=10;
		a.f=13.3f;
		a.display();
		A a2=new A("RR");
		a2.display();
	}

}
