import java.util.Scanner;

class Student{
	String name;
	int kor,eng,math;
	public Student(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
		Scanner sc=new Scanner(System.in);
		System.out.print("���� ������ ������ �Է��ϼ��� : ");
		kor=sc.nextInt();
		System.out.print("���� ������ ������ �Է��ϼ��� : ");
	eng=sc.nextInt();
		System.out.print("���� ������ ������ �Է��ϼ��� : ");
		math=sc.nextInt();
		
	}
	public void display(){

		System.out.println("===================================");
		System.out.println(name+"�л��� ���� ������ ����մϴ�.");
		System.out.println("===================================");
		System.out.printf("���� : %d ��\n",kor);
		System.out.printf("���� : %d ��\n",eng);
		System.out.printf("���� : %d ��\n",math);
		System.out.printf("���� : %d ��, ��� %.2f ��\n",kor+eng+math,(double)(kor+eng+math)/3);
	}
	
}
public class Constructor07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student("���߿�");
		s.display();
		
	}

}
