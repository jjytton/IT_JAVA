import java.util.Scanner;

public class Arr03 {
	public static void main(String args[]) {
		int[] num = new int [10];
		int sum=0;
		int min =0,max=0;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<num.length;i++){
			System.out.print(i+1+"번째 성적을 입력하세요 :" );
			num[i]=sc.nextInt();
			sum+=num[i];
			if(i==0){
				min=max=num[0];
			}else{
				if(min > num[i]) min=num[i];
				if(max < num[i]) max=num[i];
			}
		}
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		double avg = (double)sum/num.length;
		for(int i=0;i<num.length;i++){
			System.out.println(i+1+"번째 성적 : "+num[i] );
		}
		System.out.println("총점 : "+sum+" 평균 : "+avg);
	}
}
