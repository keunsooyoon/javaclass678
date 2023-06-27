package am;

public class TryExam2 {

	public static void main(String[] args) {
		
		try {
			String str = null;
			//System.out.println(str.length()); // NullPointerException
			int result = 10 / 0; //ArithmeticException
		} catch (NullPointerException e) {
			System.out.println("null 참조 : "+ e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("산술 오류 : "+ e.getMessage());
		}

}
}
