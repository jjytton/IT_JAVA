import java.util.*;

class Student {
	int id;
	String tel;

	public Student(int id, String tel) {
		this.id = id;
		this.tel = tel;
	}
}

public class HashMap03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Student> map = new HashMap<String, Student>();

		map.put("황기태", new Student(1, "010-111-1111"));
		map.put("한원선", new Student(2, "010-222-2222"));
		map.put("이영희", new Student(3, "010-333-3333"));

		System.out.println("HashMap의 요소 개수 :" + map.size());

		Set<String> names = map.keySet();

		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			String name = it.next();
			Student student = map.get(name);
			System.out.println(name + " : " + student.id + " " + student.tel);
		}

	}

}
