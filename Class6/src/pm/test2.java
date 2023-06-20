package pm;

public class test2 {
	
	public static void main(String[] args) {
		
	Rectangle rec = new Rectangle(10.0, 5.0);
	System.out.println(rec.getArea());
	
	}
}
class Rectangle {
	double width;
	double height;
	Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	double getArea() {
		return width * height;
	}
}