import java.util.Vector;

public class Vector01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v=new Vector<Integer>();
		v.add(5);
		v.add(4);
		v.add(-1);
		
		
		v.add(2,100);
		System.out.println("size() = "+v.size());
		System.out.println("capacity() = "+v.capacity());
		
		for(int i=0 ; i<v.size() ;i++){
			int n=v.get(i);
			System.out.println(n);
		}
	}

}
