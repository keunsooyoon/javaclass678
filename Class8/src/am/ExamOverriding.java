package am;

public class ExamOverriding {

	public static void main(String[] args) {

		Parent parent = new Parent();
		parent.sayHello();
		Child child = new Child();
		child.sayHello();
		child.sayHi();
	}
}
class Parent{
	void sayHello() {
		System.out.println("Hello from Parent Class");
	}
}
class Child extends Parent{
	void sayHi() {
		System.out.println("hi from Child Class");

	}
}