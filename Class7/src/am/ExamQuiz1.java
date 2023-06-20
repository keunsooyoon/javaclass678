package am;

public class ExamQuiz1 {

	public static void main(String[] args) {
		
		System.out.println(test(2,3));
		System.out.println("입력하신 세개의 숫자 중 최소값은 " + test(2,3,1) + "입니다.");

	}
	
	public static int test(int a, int b) {
		return a > b ? a : b;
	}

	public static int test(int a, int b, int c) {
		int temp = a;
		
		if (temp > b) temp = b;
		if (temp > c) temp = c;
		
		return temp;
	}
}
