package hw;

public class HW10 {

	public static void main(String[] args) {
		Circle circle1 = new Circle();
		Circle circle2 = new Circle(2);
		
		System.out.println(circle1.getRadius());
		System.out.println(circle2.getRadius());
	}
}

class Circle {
	
	private double radius;

	public Circle() {
		this.radius = 1.0;
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}
	
	
	
}
