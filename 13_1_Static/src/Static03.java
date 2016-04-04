class StaticC{
	public static int num;
	static{
		num=888;
	}
	public static int getNum() {
		return num;
	}
	public static void setNum(int num) {
		StaticC.num = num;
	}
	
}
public class Static03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticC.getNum());
		StaticC.setNum(100);
		System.out.println(StaticC.getNum());
		System.out.println(Math.PI);
		System.out.println(Math.max(10, 31));
		System.out.println(Math.log10(10.111));
		
	}

}
