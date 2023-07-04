package am;

public class ExamInheri {

	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.run(); //자식은 부모의 자원을 사용할수 있다. 
		bus.ppangppang();
		Car4 car = new Car4();
		car.run();
		//car.ppanappang(); 
		//부모가 자식의 자원은 사용할수 없다. 
	}

}

class Car4 {
	public void run() {
		System.out.println("달린다.");
	}
}

class Bus extends Car4 {
	public void ppangppang() {
		System.out.println("빵빵");
	}
}