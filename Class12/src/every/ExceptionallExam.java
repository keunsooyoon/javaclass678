package every;

public class ExceptionallExam {
	
	public static void main(String[] args) {
		
		try {
			int[] array = new int[10];
			array[1] = 5;
			System.out.println("성공");
		}catch(Exception e) {
			System.out.println("배열의 범위를 지나쳤어요.");
		}
		


	}

}
