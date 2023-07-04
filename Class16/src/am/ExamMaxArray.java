package am;

import java.util.Scanner;
public class ExamMaxArray {

	public static void main(String[] args) {

		//int[] arr = {7,3,2,4,8};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 개의 배열을 생성할까요? ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for (int i = 0 ; i < arr.length ; i++) {
			System.out.print ((i+1) + "번째 배열의 값을 입력하세요");
			arr[i] = sc.nextInt();
		}
		
		int max = arr[0];  
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
