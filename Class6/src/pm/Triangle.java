package pm;

public class Triangle {

	public static void main(String[] args) {
		//생성자 미적용 버전
//		Tri tri = new Tri();
//		tri.setBase(5.0);
//		tri.setHeight(10.0);
//		
//		double area = tri.area();
//		System.out.println(area);
		
		//생성자 적용 버전
		Tri tri = new Tri(5.0, 10.0);
		double area = tri.area();
		System.out.println(area);
	}

}

class Tri {
	
	 Tri(double base, double height){
		 this.base = base;
		 this.height = height;

	 }
	
	
	private double base;  // 캡슐화를 위해 접근제한자 private 적용
	private double height;
	
	void setBase(double base) {
		this.base = base;
	}
	
	void setHeight(double height) {
		this.height = height;
	}
	
	double getBase() {
		return base;
	}
	
	double getHeight() {
		return height;
	}
	
	double area() {
		return base * height * 0.5;
	}
}
