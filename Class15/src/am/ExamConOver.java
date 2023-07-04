package am;

public class ExamConOver {

	public static void main(String[] args) {
		Car3 c1 = new Car3("소방차");
		Car3 c2 = new Car3();
		Car3 c3 = new Car3("구급차", 1111);
	}
}

class Car3{
	String name;
	int number;
	
	public Car3() {
//		this.name = "이름없음";
//		this.number = 0;
		this("이름없음",0);
	}
	public Car3(String name) {
//		this.name = name;
		this(name,0);
	}
	public Car3(String name, int number) {
		this.name = name;
		this.number = number;
	}
}
