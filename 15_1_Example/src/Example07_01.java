// For �ݺ����� ����� 1 ~ 100 ������ ���� ��, 
// 3�� 5�� ����� ����ϴ� ���α׷��� �ۼ��ϼ���.
public class Example07_01 {
	public static void main(String[] args) {
	
		for( int i = 1 ; i <= 100 ; i++ ) {
			if( i % 3 == 0 && i % 5 == 0 )
				System.out.println(i);
		}
		
	}
}