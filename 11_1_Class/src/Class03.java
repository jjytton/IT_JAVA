
class Box2{
	int width=20;
	int height=30;
	int depth=40;
}

public class Class03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box2 b1=new Box2();
		Box2 b2 = new Box2();
		int vo1,vo2;
		
		int i1=100;
		int i2=i1;
		i1=200;
		System.out.println(i1+" , "+i2);
		b1.height=20;
		
		b2.depth=60;
		
		vo1=b1.width * b1.height * b1.depth;
		
		vo2=b2.width*b2.height*b2.depth;
		
		System.out.println("box 1 면적은 "+vo1);

		System.out.println("box 2 면적은 "+vo2);
	}

}
