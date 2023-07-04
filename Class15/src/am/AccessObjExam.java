package am;

public class AccessObjExam {

	public static void main(String[] args) {
		AccessObj obj = new AccessObj();
		System.out.println(obj.p);
		System.out.println(obj.p2);
		//System.out.println(obj.i);
		//private 같은 클래스 내에서만 접근 가능
		System.out.println(obj.k);
	}

}
