class B{
	int i;
	float f;
	public B(){
		System.out.println("B default ������ ȣ��");
	}
	public B(int i){
		this.i=i;
		System.out.println(i+" B int ������ ȣ��");
	}
	public void display(){
		System.out.println("i = "+i+" , f = "+f);
	}
}
public class Constructor03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B(10);
		b.display();
	}

}
