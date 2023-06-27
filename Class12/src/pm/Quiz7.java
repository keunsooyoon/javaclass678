package pm;


import java.util.Scanner;

public class Quiz7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("정수를 입력하세요: ");
            int num = scanner.nextInt();

            if (num < 0) {
                throw new IllegalArgumentException("음수의 팩토리얼은 계산할 수 없습니다.");
            }

            int factorial = 1

;

            for (int i = 2; i <= num; i++) {
                factorial *= i;
            }

            System.out.println("팩토리얼: " + factorial);
        } catch (IllegalArgumentException e) {
            System.out.println("예외 발생: " + e.getMessage());
        }
    }
}
