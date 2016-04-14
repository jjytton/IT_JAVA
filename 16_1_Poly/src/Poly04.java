
public class Poly04 {

	public static void method(Parent p){
		if( p instanceof Child){
			Child c=(Child)p;
			c.method3();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p=new Child();
		method(p);
	}

}
