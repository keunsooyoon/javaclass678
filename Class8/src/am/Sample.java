package am;
public class Sample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("poppy");
		System.out.println(dog.getName());
		dog.sleep();
		
		HouseDog houseDog = new HouseDog();
		houseDog.setName("happy");
		houseDog.sleep();
		houseDog.sleep(3);
	}
}
class Animal {
	String name;
	void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
}
class Dog extends Animal{
	void sleep() {
		System.out.println(this.name+" zzz");
	}
}

class HouseDog extends Dog {
	void sleep() {
		System.out.println(this.name+" zzz in house");
	}
	
	void sleep(int hour) {
		System.out.println(this.name+" zzz in house for "+ hour + " hours");

	}
}