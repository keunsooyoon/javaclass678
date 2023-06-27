package pm;

public class LedExam {

	public static void main(String[] args) {

		//객체를 생성할때 인터페이스를 자료형으로 쓸수 있다.다형성
		//TV tv = new LedTV();
		LedTV tv = new LedTV();
		tv.turnOn();
		tv.changeVolume(8);
		tv.changeChannel(39);
		tv.turnOff();
	}

}
