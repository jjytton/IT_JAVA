abstract class SuperB{
	public abstract void Disp();
}
class SubB extends SuperB{

	@Override
	public void Disp() {
		// TODO Auto-generated method stub
		System.out.println("abstract ~~");
	}
	
}
public class Class02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperB b=new SubB();
		b.Disp();
	}

}
