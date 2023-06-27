package am;

public class AnimalMain {

	public static void main(String[] args) {
		
		AnimalDog dog1 = new AnimalDog();
		AnimalCat cat1 = new AnimalCat();
		
		Animal dog2 = new AnimalDog();
		Animal cat2 = new AnimalCat();
		
		dog1.sound();
		dog2.sound();
		
	}
}
