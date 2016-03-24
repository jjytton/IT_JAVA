import java.util.Scanner;

public class Arr04 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int studentNum=0;
		int score[]=null;
		int n;
		int min=0,max=0,sum=0;
		double avg=0;
		do{
			System.out.println("===========================");
			System.out.println("1.학생수 2.점수입력 3.점수리스트 4.분석 5.종료");
			System.out.println("===========================");

			System.out.print("select >> ");
			n = sc.nextInt();

			switch (n) {
			case 1:
				System.out.print("학생 수를 입력하세요 : ");
				studentNum = sc.nextInt();
				score=new int[studentNum];
				break;
			case 2:
				for(int i=0;i<score.length;i++){
					System.out.print(i+1+"번째 성적을 입력하세요 :" );
					score[i]=sc.nextInt();
					sum+=score[i];
					if(i==0){
						min=max=score[0];
					}else{
						if(min > score[i]) min=score[i];
						if(max < score[i]) max=score[i];
					}
				}
				avg = (double)sum/score.length;
				break;
			case 3:
				for(int i=0;i<score.length;i++){
					System.out.println("score["+i+"] = "+score[i] );
				}
				break;
			case 4:
				System.out.println("최대값 : "+max);
				System.out.println("최소값 : "+min);
				System.out.println("총점 : "+sum+" 평균 : "+avg);
				break;
			case 5:
				run = false;
				break;
			default:
				System.out.println("제대로 입력하시오");
			}

		}while(run);
		System.out.println("프로그램 종료");
	}
}
