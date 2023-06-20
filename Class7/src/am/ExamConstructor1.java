package am;

public class ExamConstructor1 {

	public static void main(String[] args) {
		Constructor con = new Constructor();
		System.out.println(con.x);
	}
}

class Constructor {
	int x;
	
	Constructor() {  //기본생성자
		x = 10;
	}
	
}