package hw;

public class HW9 {

	public static void main(String[] args) {
		Person person1 = new Person("홍길동",20,"한국");
		Person person2 = new Person("이몽룡",18);
		Person person3 = new Person("성춘향");
	}

}

class Person{
	private String name;
	private int age;
	private String nationality;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public Person(String name, int age, String nationality) {
		this.name = name;
		this.age = age;
		this.nationality = nationality;
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		this.nationality = "Korea";
	}
	public Person(String name) {
		this.name = name;
		this.age = 0;
		this.nationality = "Korea";
	}
	
}