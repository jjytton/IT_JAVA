
public class Exception02 {
	public static void exception01() throws NullPointerException , Exception{
		String s=null;
		System.out.println(s.length());
	}
	public static void exception02() throws NullPointerException , Exception{
		String s=null;
		System.out.println(s.length());
	}
	public static void exception03() throws NullPointerException , Exception{
		String s=null;
		System.out.println(s.length());
	}
	public static void main(String[] args) {
		try{
			exception01();
			exception02();
			exception03();
		}catch(NullPointerException e){
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
