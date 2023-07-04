package am;

public class ExamMax {

	public static void main(String[] args) {

		int[] arr = {7,3,2,4,8};
		int max = arr[0];  // 7
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
