
public class Exception01 {
	public static void main(String[] args) {
		try{
			Class c=Class.forName("java.lang.String");
			
		}catch(ClassNotFoundException e){
			System.out.println(e.getMessage());
		}
	}
}
