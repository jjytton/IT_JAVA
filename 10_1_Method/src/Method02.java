import java.util.Scanner;

public class Method02 {

	private static int max(int a,int b,int c){
		int max=a;
		if(max < b) max=b;
		if(max < c) max=c;
		return max;
	}
	private static byte max(byte a,byte b,byte c){
		byte max=a;
		if(max < b) max=b;
		if(max < c) max=c;
		return max;
	}
	private static short max(short a,short b,short c){
		short max=a;
		if(max < b) max=b;
		if(max < c) max=c;
		return max;
	}
	private static long max(long a,long b,long c){
		long max=a;
		if(max < b) max=b;
		if(max < c) max=c;
		return max;
	}
	private static float max(float a,float b,float c){
		float max=a;
		if(max < b) max=b;
		if(max < c) max=c;
		return max;
	}
	private static double max(double a,double b,double c){
		double max=a;
		if(max < b) max=b;
		if(max < c) max=c;
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		max(1,2,3);
		max((byte)1,(byte)2,(byte)3);
		max((short)1,(short)2,(short)3);
		max(1l,2l,3l);
		max(1.1f,2.2f,3.3f);
		max(1.1,2.2,3.3);
		
		
	}

}
