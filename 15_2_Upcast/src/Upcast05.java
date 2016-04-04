class Animal{
	public void sound(){
		System.out.println("sound!");
	}
}
class Dog extends Animal{
	public void sound() {
		System.out.println("bow wow");
	}
}
class Cat extends Animal{
	public void sound(){
		System.out.println("Ya ong");
	}
}
public class Upcast05 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c=new Cat();
		Dog d=new Dog();
		c.sound();
		d.sound();
	}

}
