package pm;

public class Sample {
	

	public static void main(String[] args) {

		System.out.println(Calculator1.add(3));
		System.out.println(Calculator1.add(4));

		System.out.println(Calculator2.add(3));
		System.out.println(Calculator2.add(7));	
	
		Calculator cal1 = new Calculator();
		Calculator cal2 = new Calculator();
		
		System.out.println(cal1.add(3));
		System.out.println(cal1.add(4));
		
		System.out.println(cal2.add(3));
		System.out.println(cal2.add(7));
	
	
		Animal cat = new Animal();
		System.out.println(cat.name);
		
		cat.setName("boby");
		System.out.println(cat.name);

		Animal dog = new Animal();
		dog.setName("happy");
		System.out.println(dog.name);

		int a = 3;
		int b = 4;
		
		Sample sample = new Sample();
		int c = sample.sum(a, b);
		System.out.println(c);
		
		String x = sample.say();
		System.out.println(x);
		
		sample.sum2(3, 4);
		sample.say2();
		
		sample.sayNick("angel");
		sample.sayNick("fool");
		
		int y = 1;
		y = sample.varTest(y);
		System.out.println(y);
	}
	
	int varTest(int y) {
		y++;
		return y;
	}
	
	void sayNick(String nick) {
		if ("fool".equals(nick)) {
			return;
		}
		System.out.println("나의 별명은 " +nick+"입니다.");
	}
	
	void say2() {
		System.out.println("hi");
	}
	
	String say() {
		return "Hi";
	}
	
	int sum(int a, int b) {
		return a+b;
	}

	void sum2(int a, int b) {
		System.out.println(a+"과"+b+"의 합은 " + (a+b)+"입니다.");
	}
}
