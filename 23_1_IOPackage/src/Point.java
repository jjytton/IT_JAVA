
import java.io.Serializable;

public class Point implements Serializable {
	private static final long serialVersionUID = 79591L;
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}	
	public void Display() {
		System.out.printf("Point X : %d, Y : %d\n", 
				this.x, this.y);
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}	
}
