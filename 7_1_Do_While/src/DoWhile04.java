import java.util.Scanner;

public class DoWhile04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outter : for( int i= 0 ; i<10 ; i++){
			for(int j=0 ; j<10 ; j++){
				System.out.println(i+" "+j);
				if(j==3) 
					break Outter;
			}
		}
	}

}
