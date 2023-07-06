package am;

public class No3 {
	
	public static int search(int[] arr) {
		int head = 0;
		int tail = 6;
		int center;
		
		int target = 17;

		while (head <= tail) {

			center = (head + tail) / 2;
			if (arr[center] == target) {
				return center;
				}
			if (arr[center] < target) {
				head = center + 1;
			} else {
				tail = center - 1;
			}
		}
		return -1;
	}
	
	
	
	public static void main(String[] args) {
		int[] arr = { 11, 13, 17, 19, 23, 25, 29 };
		
		int result = search(arr);
		
		if (result == -1) {
			System.out.println("찾지 못했습니다.");
		}
		System.out.println("원하는 값은 " + result + "에 위치 해 있습니다.");
			
		}
		

		

		

}
