package am;

public class ExamMethod1 {

	public static void main(String[] args) {
		
		Method1 method1 = new Method1();
		
		System.out.println(method1.add(1, 2));
		
	}
}


class Method1{
	
	int add(int a, int b) {
		
		int c = a+b;
		
		return c;
	}
}