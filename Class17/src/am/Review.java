package am;

import java.util.Scanner;

public class Review {
	
	// 키보드로 입력 받는 매서드
	public static int[] input() {
		Scanner sc = new Scanner(System.in);
		int[] arr = {0,0,0};
		
		for (int i = 1 ; i <= 3; i++) {
			System.out.println(i + "번째 숫자를 입력하세요");
			arr[i-1] = sc.nextInt();
		}
		return arr;
	}
	
	// 최소값 찾는 매서드
	public static int min(int[] arr) {
		
		
		
		return 0;
	}

	public static void main(String[] args) {
		int[] arr = input();
		int num = min(arr);
		
		System.out.println("입력하신 세개의 수중 최소값은 " + num + "입니다.");

	}

}
