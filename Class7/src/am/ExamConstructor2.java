package am;

public class ExamConstructor2 {

	public static void main(String[] args) {
		Constructor2 con = new Constructor2(3);
		System.out.println(con.x);
		
		Constructor2 con2 = new Constructor2();
		System.out.println(con2.x);
	}
}

class Constructor2 {
	int x;
	
	Constructor2() {  
		x = 10;
	}
	
	Constructor2(int value) {  
		x = value;
	}
	
}