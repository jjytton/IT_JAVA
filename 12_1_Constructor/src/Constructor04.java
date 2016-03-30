class Box5 {
	int width;
	int height;
	int depth;

	Box5() {
		width = 1;
		height = 1;
		depth = 1;
	}

	public Box5(int width, int height, int depth) {
		super();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	public void display() {
		System.out.println("box 1 ∏È¿˚¿∫ " + width * height *depth);
	}

}

public class Constructor04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box5 b = new Box5(10, 20, 30);
		b.display();
	}

}
