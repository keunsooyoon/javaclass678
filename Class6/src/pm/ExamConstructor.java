package pm;

public class ExamConstructor {

	public static void main(String[] args) {
		//before...
		BDog bdog1 = new BDog();
		bdog1.setAge(2);
		
		BDog bdog2 = new BDog();
		bdog2.setAge(3);		
	
		System.out.println("bdog 첫번째 강아지의 나이 :" + bdog1.getAge());
		System.out.println("bdog 두번째 강아지의 나이 :" + bdog2.getAge());
		
		//after...
		ADog adog1 = new ADog(2);
		ADog adog2 = new ADog(1);
		
		System.out.println("adog 첫번째 강아지의 나이 :" + adog1.getAge());
		System.out.println("adog 두번째 강아지의 나이 :" + adog2.getAge());

	}
}
class ADog {
	
	// 생성자 (클래스명과 동일, 리턴이 아예 없다. )
	ADog(int age) {
		this.age = age;
	}
	
	// 멤버 변수
	int age;
	
	// 세터
	void setAge(int age) {
		this.age = age;//this는 호출한 그 객체의 이름자리
	}
	// 게터
	int getAge() {
		return this.age;//this는 호출한 그 객체의 이름자리
	}
}


class BDog {
	// 멤버 변수
	int age;
	
	// 세터
	void setAge(int age) {
		this.age = age;//this는 호출한 그 객체의 이름자리
	}
	// 게터
	int getAge() {
		return this.age;//this는 호출한 그 객체의 이름자리
	}
}

