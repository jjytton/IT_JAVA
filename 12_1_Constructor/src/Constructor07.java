import java.util.Scanner;

class Student{
	String name;
	int kor,eng,math;
	public Student(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
		Scanner sc=new Scanner(System.in);
		System.out.print("국어 과목의 성적을 입력하세요 : ");
		kor=sc.nextInt();
		System.out.print("영어 과목의 성적을 입력하세요 : ");
	eng=sc.nextInt();
		System.out.print("수학 과목의 성적을 입력하세요 : ");
		math=sc.nextInt();
		
	}
	public void display(){

		System.out.println("===================================");
		System.out.println(name+"학생의 성적 정보를 출력합니다.");
		System.out.println("===================================");
		System.out.printf("국어 : %d 점\n",kor);
		System.out.printf("영어 : %d 점\n",eng);
		System.out.printf("수학 : %d 점\n",math);
		System.out.printf("총점 : %d 점, 평균 %.2f 점\n",kor+eng+math,(double)(kor+eng+math)/3);
	}
	
}
public class Constructor07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student("정중영");
		s.display();
		
	}

}
