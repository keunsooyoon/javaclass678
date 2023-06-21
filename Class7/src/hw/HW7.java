package hw;

public class HW7 {

	public static void main(String[] args) {
		
		Member member = new Member();
		
		member.setAge(20);
		System.out.println(member.getAge());
	}
}
class Member {
	
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
}
