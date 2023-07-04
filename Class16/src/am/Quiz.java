package am;

import java.util.Scanner;

public class Quiz {
	
	public static int[] input() {
	Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 개의 배열을 생성할까요? ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for (int i = 0 ; i < arr.length ; i++) {
			System.out.print ((i+1) + "번째 배열의 값을 입력하세요");
			arr[i] = sc.nextInt();
		}
		
		return arr;
	}
	
	public static int max(int[] arr) {
		int max = arr[0];  
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}


	public static void main(String[] args) {

		int[] arr = input();
		
		System.out.println(max(arr));
	}

}
