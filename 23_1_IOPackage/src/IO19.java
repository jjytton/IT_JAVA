
//컬렉션 클래스는 직렬화를 지원합니다.
//컬렉션 내부에 저장되는 데이터가 직렬화를 지원한다면
//컬렉션 객체를 저장하고 읽어올 수 있습니다.
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
		
		// 직렬화를 구현한 Point 클래스를 저장하는 컬렉션 객체의 저장
		oos.writeObject(list);		
		oos.close();
		
		System.out.println("프로그램 종료");
	}
}






