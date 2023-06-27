package pm;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] numbers = { 1, 2, 3, 4, 5 };
		
		try {
			System.out.print("인덱스를 입력하세요: ");
			int num = sc.nextInt();
			
			System.out.println("해당 요소 : " + numbers[num]);
			
		} catch (Exception e) {
			System.out.println("잘못된 인덱스입니다");

		}
	}
}
