package am;

public class ExamPrivate {

	public static void main(String[] args) {
		MyClass myClass = new MyClass(); 
		//System.out.println(myClass.privateField);
		
		//private 접근자로 인해 직접 호출이 불가능함으로
		//매서드를 통해서 간접 호출하여 사용하게 된다.
		myClass.accessPrivate();
	}
}
class MyClass {
	//변수 private 적용되면 다른 클래스에서 접근 불가
	private String privateField = "im private";
	
	//같은 클래스 내의 매서드를 통해서만 접근 가능
	public void accessPrivate() {
		System.out.println(privateField);
	}
}