import java.util.StringTokenizer;

public class SplitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="아이디,이름,패스워드";
		
		String names[]=str.split(",");
		for(int i=0 ; i<names.length;i++){
			System.out.println(names[i]);
		}
		
		System.out.println();
		StringTokenizer st=new StringTokenizer(str, ",");
		int n=st.countTokens();
		for(int i=0 ; i<n;i++){
			String token=st.nextToken();
			System.out.println(token);
		}
	}

}
