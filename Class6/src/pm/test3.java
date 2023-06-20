package pm;

public class test3 {
	public static void main(String[] args) {
		StringHolder sh = new StringHolder();
		sh.setText("Hello Java !!!");
		System.out.println(sh.getText());
	}
}
class StringHolder {
	String text;
	String getText() {
		return this.text;
	}
	void setText(String text) {
		this.text = text;
	}
}
