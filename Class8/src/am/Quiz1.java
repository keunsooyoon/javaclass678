package am;

public class Quiz1 {
	public static void main(String[] args) {
		Dog2 dog = new Dog2();
		Cat2 cat = new Cat2();
		dog.sound();
		cat.sound();
	}
}
class Animal2{
	void sound() {
		System.out.println("mmmm");
	}
}
class Dog2 extends Animal2{
	void sound() {
		System.out.println("멍멍");
	}
}
class Cat2 extends Animal2{
	void sound() {
		System.out.println("야옹");
	}
}