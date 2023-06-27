package hw;

public class HW03 {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		Circle cir = new Circle();
		rec.area(2, 3);
		cir.area(2, 2);
	}
}
class Shape{
	String color;

	public String getColor() {
		return color;
	}
	
	void area(int a, int b) {
		
	}
	
}
class Rectangle extends Shape{
	void area(int a, int b) {
		System.out.println(a*b);
	}
}
class Circle extends Shape{
	void area(int a, int b) {
		System.out.println(3.14 * a * b);
	}
}