import java.io.IOException;

public class IO03 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		byte[] b;
		b=new byte[20];
		
		System.out.print("�޼����� �Է��ϼ��� : ");
		int size=System.in.read(b,3,7);
		
		System.out.println("�о�� byte�� ũ��� "+size);
		
		for( byte m : b){
			System.out.print(m+" ");
		}
		System.out.println();
		System.out.println();
		
		for( int i=0 ; i<size ;i++){
			System.out.print(b[i]+" ");
		}
		System.out.println();
		System.out.println();
		
		for( int i=0 ; i<size ;i++){
			System.out.print((char)b[i]+" ");
		}
	}

}
