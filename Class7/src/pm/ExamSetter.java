package pm;

public class ExamSetter {

	public static void main(String[] args) {
		Student student = new Student("John");
		/* 캡슐화 설정으로 인해 직접접근 불가능해졌다. 
		 * System.out.println(student.name);
		 * 
		 * student.name = "Austin"; System.out.println(student.name);
		 */
		System.out.println(student.getName());
	}
}

class Teacher{
	
	private String name;  //private 접근 제한자로 캡슐화 적용
	
	Teacher(String name) {
		this.name = name;
	}
	
	//Getter 매서드로 변수를 사용할수 있다. 
	String getName() {
		return this.name;
	}
}

