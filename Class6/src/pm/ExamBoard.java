package pm;

public class ExamBoard {

	public static void main(String[] args) {
		
		Board board1 = new Board("제목1", "내용1");
		Board board2 = new Board("제목2", "내용2");
		
		Board[] boards = new Board[2];
		
		boards[0] = board1;
		boards[1] = board2;

	}

}

class Board{
	
	Board(String title, String content) {
		this.title = title;
		this.content = content;
	}
	
	String title;
	String content;
}

