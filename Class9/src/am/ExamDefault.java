package am;

import pm.ExamDefaultOther;

public class ExamDefault {

	public static void main(String[] args) {
		ExamDefaultSame dsame = new ExamDefaultSame();
		System.out.println(dsame.defaultField);
		
		// 객체 생성에는 이상이 없다. 클래스 자체에는 public 이 설정
		// 하지만 필드는 default 로 접근제한이 설정되어 호출 불가
		ExamDefaultOther osame = new ExamDefaultOther();
		//System.out.println(osame.defaultField);

	}

}
