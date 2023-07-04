package am;

public class BinarySearch {
	
	
	public static int binarySearch(int[] arr) {
		
		int head = 0;
		int tail = 6;
		int center;
		
		while(head <= tail) {
			center = (head + tail) / 2;
			if (arr[center]==17) {
				return center;
			}
			if (arr[center] < 17) {
				head = center + 1;
			} else {
				tail = center -1;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {

		int[] arr = {15,16,17,21,30,31,40};
		int center = binarySearch(arr);
		
		if (center == -1) {
			System.out.println("찾지 못했습니다.");
		}else {
			System.out.println(center + "번째 요소가 일치");
		}
			
		
	}

}
