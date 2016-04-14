abstract class Calculator{
	public abstract int add(int a,int b);
	public abstract int sub(int a,int b);
	public abstract double avg(int []a);
}
class GoodCalc extends Calculator{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double avg(int[] a) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i : a)
			sum+=i;
		return (double)sum/a.length;
	}
	
}
public class Class03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []n={10,20,30};
		GoodCalc g=new GoodCalc();
		System.out.println(" 10 + 10 ="+g.add(10, 10));
		System.out.println(" 10 - 10 ="+g.sub(10, 10));
		System.out.println(" avg ="+g.avg(n));
		
	}

}
