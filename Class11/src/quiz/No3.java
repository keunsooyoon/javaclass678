package quiz;

public class No3 implements Drawable {

	@Override
	public void draw() {
		System.out.println("도형");
	}
	
	public static void main(String[] args) {
		No3 no3 = new No3();
		Drawable no4 = new No3();
		
		no3.draw();
		no4.draw();
	}

}
