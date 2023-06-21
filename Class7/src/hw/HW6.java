package hw;

public class HW6 {

	public static void main(String[] args) {
		
		Student student = new Student();
		
		student.setName("austin");
		System.out.println(student.getName());
	}
}
class Student {
	
	private String name;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
