package am;

public class ExamArray2 {

	public static void main(String[] args) {
		
		// 배열 생성
		int[] numbers = new int[5];
		
		// 배열 초기화
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 4;
		numbers[4] = 5;
		
		// 배열 요소 접근
		for (int i = 0 ; i < numbers.length ; i++ ) {
			System.out.println(numbers[i]);
		}
		
		// 배열 요소 값 변경
		
		numbers[4] = 9;
		
		for (int i = 0 ; i < numbers.length ; i++ ) {
			System.out.println(numbers[i]);
		}

	}

}
