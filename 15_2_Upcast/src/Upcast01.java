class Person{
	String name;
	String id;
	
}
class Student extends Person{
	String grade;
	String department;
}
public class Upcast01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p;
		Student s=new Student();
		p=s;
		
		s.name="aaa";
		
		
		
	}

}
