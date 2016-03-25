
public class Arr04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr1={{1,2,3},{4,5,6}};
		
		for(int i= 0 ; i<arr1.length;i++){
			for(int j=0 ; j<arr1[i].length;j++){
				System.out.println("arr1["+i+"]["+j+"] = "+arr1[i][j]);
			}
		}
		int [][]arr2=arr1.clone();
		for(int i=0 ;i<arr2.length;i++)
			arr2[i]=arr1[i].clone();
		
		arr2[0][2]=8888;
		
		
		
		System.out.println();
		System.out.println();
		
		for(int i= 0 ; i<arr1.length;i++){
			for(int j=0 ; j<arr1[i].length;j++){
				System.out.println("arr1["+i+"]["+j+"] = "+arr1[i][j]);
			}
		}
		
		for(int i= 0 ; i<arr2.length;i++){
			for(int j=0 ; j<arr2[i].length;j++){
				System.out.println("arr2["+i+"]["+j+"] = "+arr2[i][j]);
			}
		}
	}

}
