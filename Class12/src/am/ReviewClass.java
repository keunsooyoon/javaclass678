package am;

public class ReviewClass implements Review {

	@Override
	public void interexam() {
			System.out.println("인터페이스 복습");
	}

	@Override
	public void polyexam() {
		System.out.println("다형성 복습");

	}

	@Override
	public void etcexam() {
		System.out.println("기타등등 복습");

	}

}
