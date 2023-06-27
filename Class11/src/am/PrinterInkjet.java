package am;

public class PrinterInkjet implements Printer {

	@Override
	public void print() {
		System.out.println("잉크젯 출력기능");
	}

	@Override
	public void scan() {
		System.out.println("잉크젯 스캔기능");

	}

}
