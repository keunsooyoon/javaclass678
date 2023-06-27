package hw;

public class HW05 {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.sound();
		cat.parentSound();
	}
}

class Animal0{
	void sound(){
		System.out.println("mmmm");
	}
}
class Cat extends Animal0{
	void sound(){
		System.out.println("Meow");
	}
	
	void parentSound() {
		super.sound();
	}
}