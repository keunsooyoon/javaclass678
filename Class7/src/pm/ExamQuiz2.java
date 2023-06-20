package pm;

public class ExamQuiz2 {

	public static void main(String[] args) {
		Book book = new Book("제목","작가",320);
		// 캡슐화 즉 private 적용으로 직접 변수에 접근 불가
//		System.out.println(book.title);
//		System.out.println(book.author);
//		System.out.println(book.pages);
		System.out.println(book.getTitle());
		System.out.println(book.getAuthor());
		System.out.println(book.getPages());	
	}
}
class Book {
	private String title;
	private String author;
	private int pages;
	
	Book(String title, String author, int pages) {
		this.title = title;
		this.author = author;
		this.pages = pages;
	}
	
	String getTitle() {
		return this.title;
	}
	String getAuthor() {
		return this.author;
	}
	int getPages() {
		return this.pages;
	}
}

