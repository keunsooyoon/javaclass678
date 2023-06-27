package quiz;

public class No2 implements Connectable {

	@Override
	public void connect() {
		System.out.println("디비에 연결하였습니다. ");
	}

	@Override
	public void disconnect() {
		System.out.println("디비와 연결을 종료합니다. ");

	}

	public static void main(String[] args) {
		No2 no1 = new No2();
		Connectable no2 = new No2();
		
		no1.connect();
		no2.disconnect();

	}

}
