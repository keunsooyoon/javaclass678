package pm;

import am.ExamProtected;

public class ExamProtectedOther extends ExamProtected {
	protected String protectedField = "im protected (other)";
	
	public void accessProtected() {
		System.out.println(protectedField);
	}
}
