
public class Exercis09 {
	public static void main(String args[]){
		for(int i=2 ; i<10 ;i++){
			System.out.println(i+"���� ����մϴ�");
			for(int j=1;j<10;j++){
				if(i%2==0 && j%2==1) continue;
				else if(i%2==1 && j%2==0) continue;
				else System.out.println(i+" * "+j+" = "+i*j);
			}
		}
	}
}
