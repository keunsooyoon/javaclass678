package am;

public interface DBConnector {
	
	void list();  // 게시판 전체 목록 조회
	void detail();// 게시물 한개 조회
	void insert();// 게시물 등록
	void delete();// 게시물 삭제
	void update();// 게시물 수정

}
