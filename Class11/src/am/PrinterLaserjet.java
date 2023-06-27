package am;

public class PrinterLaserjet implements Printer {

	@Override
	public void print() {
		System.out.println("레이저젯 출력1");
		System.out.println("레이저젯 출력2");
	}

	@Override
	public void scan() {
		System.out.println("레이저젯 입력기능");

	}

}
