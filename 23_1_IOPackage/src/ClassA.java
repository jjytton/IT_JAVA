import java.io.Serializable;

public class ClassA implements Serializable{
	int f1;
	ClassB f2=new ClassB();
	static int f3;
	transient int f4;
}
