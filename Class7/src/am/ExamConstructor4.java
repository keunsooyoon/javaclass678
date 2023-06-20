package am;

public class ExamConstructor4 {

	public static void main(String[] args) {
		Constructor4 con = new Constructor4();
		System.out.println(con.x);
		System.out.println(con.y);
		
		Constructor4 con2 = new Constructor4(1,"hi");
		System.out.println(con2.x);
		System.out.println(con2.y);
	}
}

class Constructor4 {
	
	int x;
	String y;
	
	//기본생성자
	Constructor4() {
		x = 10;
		y ="default";
	}

	//변수를 가진 생성자
	Constructor4(int value, String str) {
		x = value;
		y = str;
	}
	
	
}
