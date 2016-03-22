
public class Exercis04 {
	public static void main(String args[]){
		
		int i;
		int n1,n2;
		int sum=0;
		int cnt=0;
		while(true){
			n1=(int)(Math.random()*6)+1;
			n2=(int)(Math.random()*6)+1;
			System.out.println("( "+n1+" , "+n2+" )");
			sum=n1+n2;
			if(sum == 5) cnt++;
			if(cnt==5)break;
		}

	}
}
