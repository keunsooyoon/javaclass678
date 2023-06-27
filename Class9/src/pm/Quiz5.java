package pm;

import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int num = scanner.nextInt();
		
		System.out.println(signof(num) + "입니다.");
	}
	static String signof(int num) {
		String result;
		if (num > 0) result = "양수";
		else if (num < 0) result = "음수";
		else result = "0";
		
		return result;
	}

}
