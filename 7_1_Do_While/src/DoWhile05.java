import java.util.Scanner;

public class DoWhile05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int i=0;
		int max=0,min=0,n;
		do{
			System.out.print("점수를 입력하세요 : ");
			n=sc.nextInt();
			
			if(i==0){
				max=min=n;
			}else{
				if(n > max) max=n;
				if( n < min) min=n;
			}
			i++;
		
		}while(i<10);
		System.out.println("최대 값  "+max+", 최소값 : "+min);
	}

}
