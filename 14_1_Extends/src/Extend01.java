class Point{
	int x,y;

	
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	void showPoint(){
		System.out.println("("+x+","+y+")");
	}
}
class ColorPoint extends Point{
	String color;

	public void setColor(String color) {
		this.color = color;
	}
	void showColorPoint(){
		System.out.println("color = "+color);
		showPoint();
	}
	
	
	
}
public class Extend01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorPoint c=new ColorPoint();
		c.setColor("RED");
		c.set(10, 10);
		c.showColorPoint();
	}

}
