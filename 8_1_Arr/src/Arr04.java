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
			System.out.println("1.�л��� 2.�����Է� 3.��������Ʈ 4.�м� 5.����");
			System.out.println("===========================");

			System.out.print("select >> ");
			n = sc.nextInt();

			switch (n) {
			case 1:
				System.out.print("�л� ���� �Է��ϼ��� : ");
				studentNum = sc.nextInt();
				score=new int[studentNum];
				break;
			case 2:
				for(int i=0;i<score.length;i++){
					System.out.print(i+1+"��° ������ �Է��ϼ��� :" );
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
				System.out.println("�ִ밪 : "+max);
				System.out.println("�ּҰ� : "+min);
				System.out.println("���� : "+sum+" ��� : "+avg);
				break;
			case 5:
				run = false;
				break;
			default:
				System.out.println("����� �Է��Ͻÿ�");
			}

		}while(run);
		System.out.println("���α׷� ����");
	}
}
