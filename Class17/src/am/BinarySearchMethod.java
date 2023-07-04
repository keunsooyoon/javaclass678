package am;

public class BinarySearchMethod {
	
	public static int search(int[] arr) {
		
		int head = 0;
		int tail = 6;
		int center;
		
		while (head <= tail) {
			center = (head + tail)/2;
			if (arr[center] == 17) {
				return center;
			}
			
			if (arr[center] < 17) {
				head = center + 1;
			}else {
				tail = center - 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {11, 13, 17, 19, 20, 21, 23};
	
		int result = search(arr);
		if (result == -1) {
		System.out.println("찾지 못했습니다. ");
		} else {
		System.out.println("찾으셨던 17은 " + result +"번쨰에 있습니다.");
		}
	}

}
