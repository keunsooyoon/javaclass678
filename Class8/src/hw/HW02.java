package hw;

public class HW02 {

	public static void main(String[] args) {
		Student student = new Student(123);
		System.out.println(student.getId());
	}
}
class Person{

	String name;

	public String getName() {
		return name;
	}
}
class Student extends Person {
	
	int id;

	public int getId() {
		return id;
	}
	public Student(int id) {
		super(); // 자식 객체를 생성할때 자동으로 부모 객체도 생성된다. 
		this.id = id;
	}
	
	
	
}