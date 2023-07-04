package pm;

public interface ExamWeb {

	void insert(String title, String content, String author);
	String[] readList();
	String[] readDetail(int no);
	void update(String title, String content, String author);
	void delete(int no);
}
