package am;

public class ExamMethod3 {

	public static void main(String[] args) {
		Method3 method3 = new Method3();
		System.out.println(method3.boardlist());

	}
}


class Method3 {
	
	String boardlist(){
		//디비에서 게시물 전제 목록을 꺼내오기
		String list = "게시판 전체 목록";
		return list;
	}
}
