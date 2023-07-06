package am;

public class No4 {
	public static  int search(int[] arr) {
		int head = 0;
		int tail = 6;
		int center = 0;
		
		while(head <= tail) {
			center = (head + tail) / 2;
			if(arr[center]== 17) {
				return center;
			}
			if(arr[center] < 17) {
				head = center + 1;
				
			}else {
				tail = center - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		int[] arr = {11, 13,17,19,20,21,23};
		int result = search(arr);
		if(result == -1) {
			System.out.println("값을 찾지 못했습니다");
		} else {
			System.out.println((result +1) + "번째에 위치합니다");
		}

	}

}
