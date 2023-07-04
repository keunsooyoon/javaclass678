package re;

public class Exam1 {
	public static void main(String[] args) {
		
		Car c1 = new Car();
//		c1.name="소방차";
//		c1.number=1234;
		
		Car c2 = new Car();
//		c2.name="구급차";
//		c2.number=1111;
		
//		System.out.println(c1.name);
//		System.out.println(c2.name);
		c1.noinout();
		Car.noinout();
	}
}


class Car{
	
	private String name;
	private int number;
	
	static void print() {
		System.out.println("객체생성 실습");
	}
	
	static void noinout() {
		System.out.println("호출");
	}
}