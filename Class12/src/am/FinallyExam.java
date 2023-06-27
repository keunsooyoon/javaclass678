package am;

public class FinallyExam {

	public static void main(String[] args) {


		try {
			int result = 10 / 2;
		} catch (ArithmeticException e) {
			System.out.println("산술 오류 : " + e.getMessage());
		} finally {
			System.out.println("finally 구문은 항상 실행");
		}

	}

}
