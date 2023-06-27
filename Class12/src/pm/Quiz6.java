package pm;

import java.util.Scanner;

public class Quiz6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("점수를 입력하세요: ");
            int score = scanner.nextInt();

            if (score < 0 || score > 100) {
                throw new IllegalArgumentException("잘못된 점수입니다.");
            }

            String grade;

            if (score >= 90) {
                grade = "A";
            } else if (score >= 80) {
                grade = "B";
            } else if (score >= 70) {
                grade = "C";
            } else if (score >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }

            System.out.println("학점: " + grade);
        } catch (IllegalArgumentException e) {
            System.out.println("예외 발생: " + e.getMessage());
        }
    }
}
