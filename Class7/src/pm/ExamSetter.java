package pm;

public class ExamSetter {

	public static void main(String[] args) {
		Teacher teacher = new Teacher("John");

		System.out.println(teacher.getName());
//		teacher.name="Austin"; //캡슐화로 직접 변경은 불가능하다. 
		//setter 매서드를 통해서 변경이 가능해졌다. 
		teacher.setName("Austin");
		System.out.println(teacher.getName());

	}
}

class Teacher{
	
	private String name;  //private 접근 제한자로 캡슐화 적용
	
	Teacher(String name) {
		this.name = name;
	}
	//Setter 매서드로 변수 값을 변경할수 있다. 
	void setName(String name) {
		this.name = name;
	}
	
	//Getter 매서드로 변수를 사용할수 있다. 
	String getName() {
		return this.name;
	}
}

