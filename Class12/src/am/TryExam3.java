package am;

public class TryExam3 {

	public static void main(String[] args) {
		
		try {
			String str = null;
			//System.out.println(str.length()); // NullPointerException
			int result = 10 / 0; //ArithmeticException
		} catch (NullPointerException | ArithmeticException e) {
			System.out.println("예외 발생 : "+ e.getMessage());
		} 

}
}
