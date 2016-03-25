
public class Arr03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []oldArray={"String","Array","SO"};
		String []newArray;
		newArray=new String[5];
		
		System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
		
		for(int i= 0 ; i<newArray.length;i++){
			System.out.println("newArray ["+i+"] = "+newArray[i]);
		}
	}

}
