package pm;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
	try {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 1를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.println("숫자 2를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		int sum = num1 / num2 ;
		System.out.println(sum);
		
	} catch (Exception e) {
		System.out.println("0으로 나눌 수 없습니다.");
	}

	
	}
}