package am;

public class ExamInheritance {

	public static void main(String[] args) {

		Parent2 parent2 = new Parent2();
		parent2.sayHello();
		Child2 child2 = new Child2();
		child2.sayHello();
		child2.sayHi();
	}
}
class Parent2{
	void sayHello() {
		System.out.println("Hello from Parent Class");
	}
}
class Child2 extends Parent{
	void sayHi() {
		System.out.println("hi from Child Class");
	}
	
	void sayHello() {
		System.out.println("Hello from Child Class");
	}
}