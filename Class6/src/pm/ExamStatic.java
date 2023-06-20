package pm;

public class ExamStatic {

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		cat.bark();
		

		
		Croc.bark();
		
	// Cat.bark();  에러 !!!Cat 클래스의 매서드에는  static이 없다. 
	}
}

class Cat {
	void bark() {
		System.out.println("Meeu!!!");
	}
}

class Croc {
	static void bark() {
		System.out.println("Peeu!!!");
	}
}