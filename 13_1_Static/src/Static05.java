
public class Static05 {
	int speed;
	void run(){
		System.out.println(speed+"���� �޸��ϴ�.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static05 s=new Static05();
		s.speed=60;
		s.run();
		System.out.println();
		System.out.print("System");
		System.out.print(".");
		System.out.printf("%s.printf", "out");
		System.out.println("(\"Hello Java\")\n\n");

		
	}

}
