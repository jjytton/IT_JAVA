
public class Tire {

	public int maxRotation;
	public int accumulatedRotation;
	public String location;

	public Tire(String location, int maxRotation) {// 생성자
		this.location = location;
		this.maxRotation = maxRotation;
	}

	public boolean roll() { // roll()메소드 생성
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + "Tire 수명: " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
	}

}
