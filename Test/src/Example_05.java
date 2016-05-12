import java.io.InputStreamReader;

class Super{
	void dis(){
		System.out.println("Aa");
	}
}
class Sub extends Super{
	void dis(){
		System.out.println("bb");
	}
}
public class Example_05{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super s=new Sub();
		s.dis();
		InputStreamReader isr=new InputStreamReader(System.in);
	}

}
