
public class Method03 {

	public static void method1(int n[]){
		n[0]=33;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[]={1,2,3,4,5};
		for(int i=0 ; i<n.length;i++)
			System.out.println("n["+i+"] = "+n[i]);
		
		method1(n);
		
		for(int i=0 ; i<n.length;i++)
			System.out.println("n["+i+"] = "+n[i]);
	}

}
