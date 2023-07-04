package am;

public class ExamThis {

	public static void main(String[] args) {

		Car1 c1 = new Car1("소방차"); 
		Car1 c2 = new Car1("구급차"); 
		
		System.out.println(c2.name);
		System.out.println(c1.name);

	}
}

class Car1 {
	String name;
	int number;
	
	public Car1(String name) {
		this.name = name;
	}
}