package am;



public class DBjdbc implements DBConnector {

	@Override
	public void list() {
		System.out.println("게시판 목록 보기");
	}

	@Override
	public void detail() {
		System.out.println("게시판 한개 보기");

	}

	@Override
	public void insert() {
		System.out.println("게시판 등록 ");

	}

	@Override
	public void delete() {
		System.out.println("게시판 삭제");

	}

	@Override
	public void update() {
		System.out.println("게시판 수정");


	}

}
