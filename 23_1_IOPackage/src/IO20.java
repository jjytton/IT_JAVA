
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.*;

public class IO20 {
	public static void main(String[] args) throws Exception {
		ArrayList<Point> list;

		String dirName = "d:\\Java";
		String fileName = "Dt.txt";

		File dir = new File(dirName);
		File file = new File(dir, fileName);
		
		ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
		list = (ArrayList<Point>) ois.readObject();
		ois.close();

		for (int i = 0; i < list.size(); i++)
			list.get(i).Display();

		System.out.println("프로그램 종료");

	}
}
