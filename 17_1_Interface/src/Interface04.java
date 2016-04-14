
public class Interface04 {

	public static void printSound(Soundable s){
		System.out.println(s.sound());
	}
	public static void main(String[] args) {
		printSound(new Dog());
		printSound(new Cat());
	}

}
