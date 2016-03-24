
public class Arr01 {
	public static void main(String args[]) {
		int[] score = { 83, 90, 87 };
		int sum=0;
		for (int i = 0; i < score.length; i++){
			System.out.println(score[i]);
			sum+=score[i];
		}
			
		System.out.println("ÃÑÇÕ : "+sum);
		double avg = (double)sum/3;
		System.out.println("Æò±Õ : "+avg);
		
		int []score2;
		//score2={1,2,3};
		score2=new int[]{1,2,3};
	}
}
