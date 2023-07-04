package am;

public class ExamLinearSearch {
	
	public static int linearSearch(int[] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] == 5) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		
		int[] arr = {7,3,2,5,8};
		
		int result = linearSearch(arr);
		
		if (result == -1) { 
			System.out.println("값을 찾지 못했습니다. ");
		} else {
		
		System.out.println(result + "번째에서 찾았습니다.");

	
	}

	}
}
