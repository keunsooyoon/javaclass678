package am;

public class ExamMethod2 {

	public static void main(String[] args) {
		
		Method2 method2 = new Method2();
		method2.boardinput("안녕하세요");

	}
}


class Method2{
	
	Method2() {}
	
	void boardinput(String content) {
		//디비에 게시물 넣기 성공
		System.out.println(content + " 내용을 디비에 성공적으로 넣었습니다.");
	}
}