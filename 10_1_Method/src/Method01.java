import java.util.Scanner;

public class Method01 {

	private static void sum(int i){};
	private static int sum(int i,char c){return 0;}
	private static void sum(char i1,int i2){}
	private static void sum(int i1,int i2){
		System.out.printf("%d + %d = %d \n",i1,i2,i1+i2);
	}
	private static void sum(int i1,int i2,int i3){
		System.out.printf("%d + %d + %d = %d \n",i1,i2,i3,i1+i2+i3);
	}
	private static void sum(int i1,int i2,int i3,int i4){
		System.out.printf("%d + %d + %d + %d = %d \n",i1,i2,i3,i4,i1+i2+i3+i4);
	}
	private static void sum(float f){}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(10);
		sum(10,'a');
		sum('a',10);
		sum(10,20);
		sum(10,20,30);
		sum(10,20,30,40);
		sum(10.1f);
	}

}
