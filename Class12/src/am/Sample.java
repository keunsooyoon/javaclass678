package am;

public class Sample {
    public static void shouldBeRun() {
        System.out.println("ok thanks.");
    }
    public static void main(String[] args) {
        //Sample sample = new Sample();
        int c;
        try {
            c = 4 / 0;
        } catch (ArithmeticException e) {
            c = -1;
        } finally {
            Sample.shouldBeRun();  // 예외에 상관없이 무조건 수행된다.
        }
    }
}