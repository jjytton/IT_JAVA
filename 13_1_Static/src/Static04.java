class StaticD{
	public int num1;
	public static int num2;
	
	public void disp1(){
		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+StaticD.num2);
	}
	public static void disp2(){
		System.out.println("num2 = "+num2);
	}
	
}
public class Static04 {

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
