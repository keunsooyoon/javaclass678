package am;

public class ExamOver {

	public static void main(String[] args) {
		System.out.println(plus(1,2));
		System.out.println(plus(1,2,3));
		System.out.println(plus("1","2"));
	}
	
	public static int plus(int x, int y) {
		return x + y;
	}
	
	public static int plus(int x, int y, int z) {
		return x + y + z;
	}
	
	public static String plus(String x, String y) {
		return x + y;
	}

}
