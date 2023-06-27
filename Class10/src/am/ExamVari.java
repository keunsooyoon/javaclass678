package am;

import java.util.ArrayList;
import java.util.HashMap;

public class ExamVari {

	public static void main(String[] args) {
		//변수명
		int a;    //정수
		String b; //문자열
		
		//변수명 작성 규칙
		//변수명은 숫자로는 시작할수 없다. 
		int a1;
		//int 1a;
		//_ 언더바 $ 이외의 특수문자는 사용할수 없다. 
		int _a;
		//int *a;
		// 자바의 키워드는 변수명으로 사용할수 없다. 
		//int for;
		
		//변수명 작성 권장사항
		// 1. 의미있는 단어로 변수명을 사용하자
		int num;
		String str;
		// 2. 단어를 여러개 사용할때는 첫글자만 대문자로 사용하자
		//    단 첫단어는 소문자로
		String myClassOne;
		// 3. 한글 변수명은 절대 사용하지 말자. 
		int 숫자;
		
		// String int boolen
		
		// Array 배열
		
		// 일반 변수는 1개의 수만 담을 수 있다 
		// 하지만 특성상 컴퓨터에서는 데이터를 대량으로 다룰 일이 많다. 
		
		// 따라서 배열은 대량의 데이터를 한번에 다루기 편하다. 
		// 배열은 한 번생성되면 최초의 수가 고정된다. 변경할수 없다. 
		
		int[] odds = {1,3,5,7};
		
		String[] weeks = {"월","화","수"};
		
		// 배열은 자료형이라기 보다 자료형의 집합이다. 
		
		System.out.println(weeks[2]); 
		
		// 배열의 크기 / 배열의 길이
		
		System.out.println(weeks.length);
		System.out.println(odds.length);
		
		//ArrayList
		//배열리스트는 배열과 비슷하지만 추가로 편리한 기능을 더 갖고 있다. 
		//배열은 한 번생성하면 그 크기가 고정된다 하지만 배열리스트는 자유롭게
		//변화할수 있다. 
		
		// 파일의 제일 위에서 import 후 사용 가능하다. 
		// import java.util.ArrayList;
		
		ArrayList colors = new ArrayList();
		
		colors.add("빨강빨강");
		colors.add("파랑파랑");
		colors.add("노랑노랑");
		
		colors.add(0,"달콤한솜사탕");
		
		//저장한 값 꺼내기  get
		
		System.out.println(colors.get(0));
		
		colors.add(1,"검정검정");
		
		System.out.println(colors.get(1));
		
		System.out.println(colors.size());
		
		// 삭제하는 방법은 2가지가 있다. (이름은 remove로 같다. )
		
		colors.remove("빨강빨강");  // 객체 값으로 삭제
		System.out.println(colors.size());
		colors.remove(0);         //인덱스 값으로 삭제
		System.out.println(colors.size());
		
		colors.add(11);  // 현재는
		
		
		// 제네릭스 Generics
		// 배열리스트에 한가지 자료형만 들어가게 강제한다. 
		
		colors.add(11);  // 현재는 배열리스트에 문자뿐만이 아니라 숫자도 들어간다. 
		
		
		//ArrayList<String> numbers = new ArrayList<String>();
		ArrayList<String> numbers = new ArrayList<>();
		
		numbers.add("one");
		numbers.add("two");
//		numbers.add(1);
		
		

		
		
	}

}
