
public class Math01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=-2.8989080;
		System.out.println(Math.abs(a));
		System.out.println(Math.ceil(a));
		System.out.println(Math.floor(a));
		System.out.println(Math.sqrt(a));
		System.out.println(Math.exp(a));
		System.out.println(Math.rint(3.141592));
		System.out.println("이번주 행운의 번호는");
		
		for(int i=0 ; i<5; i++){
			System.out.print(" "+Math.round(Math.random()*44+1));
		}
	}

}
