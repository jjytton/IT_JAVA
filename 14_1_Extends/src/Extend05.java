class SuperE{
	int SuperNum;
	public SuperE(){
		System.out.println("SuperC()");
	}
	public SuperE(int superNum) {
		super();
		SuperNum = superNum;
		System.out.println("SuperC(int i)");
	}
}
class SubE extends SuperC{
	int SubNum;
	public SubE(){
		System.out.println("SubC()");
	}
	public SubE(float f){
		super(10);
		System.out.println("SubC(float)");
	}
}


public class Extend05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubE s=new SubE(10.1f);
	}

}
