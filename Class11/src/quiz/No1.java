package quiz;

public class No1 implements Playable{

	public static void main(String[] args) {
		No1 no1 = new No1();
		no1.play();
		Playable no2 = new No1();
		no2.play();
	}

	@Override
	public void play() {
		System.out.println("플레이 기능");		
	}

}
