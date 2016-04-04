class A2{
	int SuperNum;
	public A2(){
		System.out.println("A2()");
	}
	public A2(int superNum) {
		super();
		SuperNum = superNum;
		System.out.println("A2(int i)");
	}
}
class B2 extends A2{
	int SubNum;
	public B2(){
		System.out.println("B2()");
	}
	public B2(int i){
		super(10);
		System.out.println("B2(int)");
	}
	public B2(float f){
		super(10);
		System.out.println("B2(float)");
	}
}


public class Extend06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B2 b=new B2(5);
	}

}
