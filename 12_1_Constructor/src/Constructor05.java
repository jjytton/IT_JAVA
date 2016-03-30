class GuGuDan {
	public GuGuDan(int dan) {
		display(dan);
	}

	public GuGuDan() {
		display();
	}

	public void display() {
		for (int i = 2; i < 10; i++) {
			System.out.println(i + " 단을 출력합니다");
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
		}
		System.out.println();
	}

	public void display(int dan) {
		System.out.println(dan + " 단을 출력합니다");
		for (int j = 1; j < 10; j++) {
			System.out.printf("%d * %d = %d\n", dan, j, dan * j);
		}
		System.out.println();
	}
}

public class Constructor05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuGuDan g=new GuGuDan();
		GuGuDan g2=new GuGuDan(11);
	}

}
