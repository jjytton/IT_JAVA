class Parent{
	public void method1(){
		System.out.println("Parent method1");
	}
	public void method2(){
		System.out.println("Parent method2");
	}
}
class Child extends Parent{
	public void method2(){
		System.out.println("Child method2");
	}
	public void method3(){
		System.out.println("Child method3");
	}
}
public class Poly02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child=new Child();
		Parent p=child;
		p.method1();
		p.method2();
	}

}
