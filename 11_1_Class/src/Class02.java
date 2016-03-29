
class Box1{
	int width;
	int height;
	int depth;
}

public class Class02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box1 b1=new Box1();
		Box1 b2 = new Box1();
		int vo1,vo2;
		
		b1.width=10;
		b1.height=20;
		b1.depth=30;
		
		b2.width=40;
		b2.height=50;
		b2.depth=60;
		
		vo1=b1.width * b1.height * b1.depth;
		
		vo2=b2.width*b2.height*b2.depth;
		
		System.out.println("box 1 면적은 "+vo1);

		System.out.println("box 2 면적은 "+vo2);
	}

}
