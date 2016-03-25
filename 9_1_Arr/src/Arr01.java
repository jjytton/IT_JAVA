
public class Arr01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr1={1,2,3,4,5};
		
		for(int i=0 ; i<arr1.length ;i++)
			System.out.println("arr1["+i+"] = "+arr1[i]);
	
		int []arr2=arr1.clone();
		arr2[3]=888;
		for(int i=0 ; i<arr1.length ;i++)
			System.out.println("arr1["+i+"] = "+arr1[i]);
	
		for(int i=0 ; i<arr1.length ;i++)
			System.out.println("arr2["+i+"] = "+arr2[i]);
	
		
	}

}
