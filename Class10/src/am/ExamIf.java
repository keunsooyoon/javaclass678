package am;

public class ExamIf {

	public static void main(String[] args) {
		// if
		// if(조건식) {
		//   //조건식이 true 일경우 실행 구문
		//   //실행구문이 여러줄일 경우는 반드시 중괄호 사용
		// }
		// if(조건식) 실행구문
		
		// true / false 는 반드시 소문자로만 사용한다. True/False 금지
		if (true) {  //조건식의 최종값은 항상 true / false 만 올수 있다. 
			System.out.println("true일 경우만 실행");
		}
		
		int no1 = 5;
		int no2 = 7;
		
		if (no1 < no2) { //조건식의 최종값이 true이다. 
			System.out.println("true일 경우만 실행");
		}

		if (no1 < no2) System.out.println("true일 경우만 실행");
		
		String pass1 = "hello";//디비의 암호
		String pass2 = "hello";//입력한 암호
		
		//문자열이 같은지 비교할때는 ==를 사용하지 말고 .equals() 매서드를 사용하자
		if (pass1.equals(pass2)) {
			System.out.println("로그인 성공");
		}
		
		pass1 = "hello";//디비의 암호
		pass2 = "hi";//입력한 암호
		
		if (pass1.equals(pass2)) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
		
		
		if (pass1.equals(pass2)) System.out.println("로그인 성공");
		else System.out.println("로그인 실패");
			
		
		
		pass1 = "hello";//디비의 암호
		pass2 = "hi";//입력한 암호
		
		String uid1 = "guest";
		String uid2 = "guest";
		
		
		if (pass1.equals(pass2)) {
			System.out.println("암호가 일치합니다. ");
		} else if (uid1.contentEquals(uid2)){
			System.out.println("아이디가 일치합니다.");
		} else {
			System.out.println("회원 가입하세요");
		}
		
	}

}
