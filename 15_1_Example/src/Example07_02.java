// For �ݺ����� ����� 1 ~ 500 ������ ���� ��, 
// 3�� 5�� ����� �հ踦 ����ϴ� ���α׷��� �ۼ��ϼ���.
public class Example07_02 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		for( int i = 1 ; i <= 500 ; i++ ) {
			if( i % 3 == 0 && i % 5 == 0 )
				sum += i;
		}
		
		System.out.printf(
				"1 ~ 500 ������ ���� �� 3�� 5�� ����� ���� %d �Դϴ�.\n", 
				sum);		
	}
}
