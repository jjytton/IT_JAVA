class SuperC{
	int SuperNum;
	public SuperC(){
		System.out.println("SuperC()");
	}
	public SuperC(int superNum) {
		super();
		SuperNum = superNum;
		System.out.println("SuperC(int i)");
	}
}
class SubC extends SuperC{
	int SubNum;
	public SubC(){
		System.out.println("SubC()");
	}
}


public class Extend04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubC s=new SubC();
	}

}
