
//�÷��� Ŭ������ ����ȭ�� �����մϴ�.
//�÷��� ���ο� ����Ǵ� �����Ͱ� ����ȭ�� �����Ѵٸ�
//�÷��� ��ü�� �����ϰ� �о�� �� �ֽ��ϴ�.
import java.util.*;
import java.io.*;

public class IO19 {	
	public static void main(String[] args) throws Exception {
		ArrayList<Point> list = new ArrayList<Point>();		
		
		Random random = new Random();
	
		for( int i = 500 ; i < 10000 ; i++ )						
			list.add(new Point(random.nextInt(i),
					random.nextInt(i)));		
		
		for( int i = 0 ; i < list.size() ; i++ )
			list.get(i).Display();
		
		String dirName = "d:\\Java";
		String fileName = "Dt.txt";

		File dir = new File(dirName);				
		File file = new File(dir, fileName);
		
		ObjectOutputStream oos = 
			new ObjectOutputStream(
				new BufferedOutputStream(
						new FileOutputStream(file)));
		
		// ����ȭ�� ������ Point Ŭ������ �����ϴ� �÷��� ��ü�� ����
		oos.writeObject(list);		
		oos.close();
		
		System.out.println("���α׷� ����");
	}
}






