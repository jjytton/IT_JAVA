import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

class AA implements Serializable {
	public int num1;
	public int num2;
	public void print(){
		System.out.println(num1+" , "+num2);
	}
}

public class IO05 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.out.println("���α׷� ����");
		String dirName = "D:\\Java";
		String fileName = "IO05.txt";
		File dir = new File(dirName); // �ҽ� ����
		if (!dir.exists()) {
			dir.mkdirs();
		}
		File file = new File(dir, fileName); // ���� ����
		ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));

		AA a=new AA();
		a.num1=100;
		a.num2=200;
		oos.writeObject(a);
		oos.close();
		ObjectInputStream ois=new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
		AA b=(AA)ois.readObject();
		b.print();
		ois.close();
		System.out.println("���α׷� ����");
		
	}

}
