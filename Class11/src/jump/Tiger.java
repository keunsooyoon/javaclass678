package jump;

public class Tiger extends Predator implements Barkable{

	public String getFood() {
		return "apple";
	}

	@Override
	public void bark() {
		System.out.println("어흥");
		
	}
}
