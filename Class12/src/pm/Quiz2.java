package pm;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("숫자를 하나 입력하세요 ");
			int num = sc.nextInt();
			int result = 1 / num;
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없습니다");
		}
	}
}
