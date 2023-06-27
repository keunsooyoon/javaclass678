package pm;

import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

	try {
		
//		int temp = num1;
//		if (temp < num2) temp = num2;
//		if (temp < num3) temp = num3;
		
		System.out.print("숫자 1를 입력하세요 : ");
		Integer num1 = sc.nextInt();
		//if ("null".equals(num1)) throw new IllegalArgumentException("입력된 숫자가 없습니다.");
		
		System.out.print("숫자 2를 입력하세요 : ");
		String num2 = sc.nextLine();
		if ("null".equals(num2)) throw new IllegalArgumentException("입력된 숫자가 없습니다.");
		
		System.out.print("숫자 3를 입력하세요 : ");
		String num3 = sc.nextLine();
		if ("null".equals(num3)) throw new IllegalArgumentException("입력된 숫자가 없습니다.");

//		
//		int tnum1 = Integer.parseInt(num1);
//		int tnum2 = Integer.parseInt(num2);
//		int tnum3 = Integer.parseInt(num3);
		
//		int temp = Math.max(tnum1, Math.max(tnum2, tnum3));
//		
//		System.out.println("최대값은 " + temp + "입니다.");
		
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}

	
	
	}
}