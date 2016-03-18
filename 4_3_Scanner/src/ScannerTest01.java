import java.util.Scanner;

public class ScannerTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.print("국어 input >> ");
		int kor=sc.nextInt();
		
		System.out.print("영어 input >> ");
		int eng=sc.nextInt();
		
		System.out.print("수학 input >> ");
		int math=sc.nextInt();
		
		double score = (kor + eng + math) /3;
		System.out.println("평점 : "+score);
		
		if(score >=90){
			System.out.println("A Class");
		}else if (score < 90 &&  score >= 80){
			System.out.println("B Class");
		}else if (score < 80 &&  score >= 70){
			System.out.println("C Class");
		}else if (score < 70 &&  score >= 60){
			System.out.println("D Class");
		}else{
			System.out.println("E Class");
		}
	}

}
