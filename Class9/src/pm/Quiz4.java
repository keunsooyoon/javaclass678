package pm;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 A : ");
		int num1 = scanner.nextInt();
		
		System.out.print("정수 B : ");
		int num2 = scanner.nextInt();
		
		if (num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		for (int i = num1; i <= num2; i++) {
			System.out.print(i + " ");
		}
		
		
		
	}

}
