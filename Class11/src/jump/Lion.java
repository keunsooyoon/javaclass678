package jump;

public class Lion extends Predator implements Barkable{

	public String getFood() {
		return "banana";
	}

	@Override
	public void bark() {
		System.out.println("으르렁");
		
	}
}
