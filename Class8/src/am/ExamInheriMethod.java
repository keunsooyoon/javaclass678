package am;

public class ExamInheriMethod {

	public static void main(String[] args) {
		Child5 child = new Child5();
		child.method2();
	}
}
class Parent5{
	void method1() {
		System.out.println("method 1 in parent");
	}
	void method2() {
		System.out.println("method 2 in parent");
	}
}
class Child5 extends Parent5{
	@Override
	void method2() {
		super.method2();
		System.out.println("method 2 in child");
	}
}
