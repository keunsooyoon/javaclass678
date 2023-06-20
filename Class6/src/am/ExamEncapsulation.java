package am;

public class ExamEncapsulation {

	public static void main(String[] args) {

		CCar ccar = new CCar();
		ccar.setColor("빨강");
		System.out.println(ccar.getColor());
		
	}
}

class CCar {
	
	private String color; // private 접근제한자
	
	String getColor() {   // 게터
		return color;
	}
	
	void setColor(String color) {   //세터
		this.color = color;
	}
}
