package pm;

public class ExamAuto {

	String subject;
	String memo;
	String Author;
	String date;
	
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public ExamAuto(String subject, String memo, String author, String date) {
		super();
		this.subject = subject;
		this.memo = memo;
		Author = author;
		this.date = date;
	}
	
	
	
	
}
