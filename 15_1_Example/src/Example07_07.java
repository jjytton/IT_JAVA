// 1 ~ 100 ������ ���� �� �Ҽ��� ����ϴ� ���α׷��� �ۼ��ϼ���.
// �Ҽ� : 1�� �ڱ� �ڽſܿ� ������ �������� �ʴ� ��
public class Example07_07 {
	public static void main(String[] args) {
	
		boolean flag;
		
		for( int i = 1 ; i <= 100 ; i++ ) {
			
			flag = true;
			
			for( int j = 2 ; j <= (i - 1) ; j++ ) {
				if( i % j == 0 ) {
					flag = false;
					break;
				}
			}
			
			if( flag )
				System.out.println(i);
		}

	}
}


