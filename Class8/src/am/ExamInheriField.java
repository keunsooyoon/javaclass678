package am;

public class ExamInheriField {

	public static void main(String[] args) {
		Child3 child = new Child3();
		child.printX();
	}
}
class Parent3 {
	int x = 10;
}
class Child3 extends Parent3{
	public void printX() {
		System.out.println(x); // 부모 클래스의 필드값
	}
}