package am;

public class PrinterDot implements Printer {

	@Override
	public void print() {
		System.out.println("토트프린터 출력기능");

	}

	@Override
	public void scan() {
		System.out.println("토트프린터 입력기능");

	}

}
