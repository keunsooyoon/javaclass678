package am;

public class ExamInheriConstructor {

	public static void main(String[] args) {
		//Parent4 parent = new Parent4();
		Child4 child = new Child4();
	}
}
class Parent4{

}
class Child4 extends Parent4{
	Child4() {
		System.out.println("Child Constructor");
	}
}