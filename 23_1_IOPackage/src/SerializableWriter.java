import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableWriter {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos=new FileOutputStream("c:\\tmp\\obj.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		ClassA a=new ClassA();
		a.f1=100;
		a.f2.f1=200;
		a.f3=300;
		a.f4=400;
		
		oos.writeObject(a);
		oos.flush();
		oos.close();
		fos.close();
		
		FileInputStream fis=new FileInputStream("c:\\tmp\\obj.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		ClassA b=(ClassA)ois.readObject();
		System.out.println(b.f1+" "+b.f2.f1+" "+b.f3+" "+b.f4);
	}
}
