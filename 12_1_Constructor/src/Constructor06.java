class Box6{
	double width,height,depth;
	public Box6(int i, int j, int k) {
		// TODO Auto-generated constructor stub
		width=i;
		height=j;
		depth=k;
	}
	public Box6(double d, double e, double f) {
		// TODO Auto-generated constructor stub
		width=d;
		height=e;
		depth=f;
	}
	
}
public class Constructor06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box6 b=new Box6(10,20,30);
		int v=(int) (b.width*b.depth*b.height);
		System.out.println("박스의 부피 = "+v);
		b=new Box6(11.1,20.2,30.3);
		double v2=b.width*b.depth*b.height;
		System.out.println("박스의 부피 = "+v2);
		b=new Box6(10,20,30.3);
		double v3=b.width*b.depth*b.height;
		System.out.println("박스의 부피 = "+v3);
		
	}

}
