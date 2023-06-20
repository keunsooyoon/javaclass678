package pm;

public class ExamClass1 {

	public static void main(String[] args) {
		// 기본 클래스 객체생성
		
		Dog dog = new Dog();
		dog.bark();
	}
}

class Dog {
	// 멤버 변수
	String breed;
	int age;
	
	// 멤버 매서드
	void bark() {
		System.out.println("Bark!!!");
	}
}