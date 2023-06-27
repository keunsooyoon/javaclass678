package pm;

import java.util.Random;

public class Quiz2 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int[] arr = new int[10];
		
		
		arr[0] = 1 + random.nextInt(100);
		arr[1] = 1 + random.nextInt(100);
		arr[2] = 1 + random.nextInt(100);
		arr[3] = 1 + random.nextInt(100);
		arr[4] = 1 + random.nextInt(100);
		arr[5] = 1 + random.nextInt(100);
		arr[6] = 1 + random.nextInt(100);
		arr[7] = 1 + random.nextInt(100);
		arr[8] = 1 + random.nextInt(100);
		arr[9] = 1 + random.nextInt(100);
		
		for(int i:arr) {
			System.out.println(i);
		}

	}

}
