package am;

public class MethodOver {

	public static void main(String[] args) {

		display();
		display("hi");
		display("hi",2);
	}
	
	public static void display() {
	    System.out.println("Nothing to display");
	}
	public static void display(String str) {
	    System.out.println("Displaying: " + str);
	}
	public static void display(String str, int num) {
	    System.out.println("Displaying: " + str + " and " + num);
	}
	
	
	
	
	
//	public static void display(int num) {
//	    System.out.println("Displaying an integer: " + num);
//	}
//
//	public static void display(String str) {
//	    System.out.println("Displaying a string: " + str);
//	}

	
	
	
}
