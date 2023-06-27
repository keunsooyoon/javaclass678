package jump;

public class Sample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("poppy");
		System.out.println(dog.name);
		dog.sleep();
		
		HouseDog houseDog = new HouseDog();
		houseDog.setName("happy");//Animal
		houseDog.sleep(); //Dog
		houseDog.sleep(3); 

	}

}
