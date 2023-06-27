package am;

import pm.ExamPublicOther;

public class ExamPublic {

	public static void main(String[] args) {
		ExamPublicSame psame = new ExamPublicSame();
		ExamPublicOther osame = new ExamPublicOther();
		
		System.out.println(psame.publicField);
		System.out.println(osame.publicField);
	}
}
