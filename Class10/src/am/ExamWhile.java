package am;

public class ExamWhile {

	public static void main(String[] args) {
		// for 문은 반복 횟수 확실할 때 주로 사용
		// while 문은 반복 횟수 가 불확실할때 주로 사용
		
		//while (조건식) {
		//	실행구문
		//}
		
//		while (true) {     //무한반복
//			System.out.println("안녕하세요!!");
//		}
		
		int mnum = 0;
		
		while (mnum < 5) {     
			System.out.println(mnum + " 안녕하세요!!");
			mnum++;    // mnum = mnum + 1;   // mnum += 1;
		}
		
		mnum = 0;
		
		while (mnum <= 9) {
			
			if (mnum % 2 == 1)
			System.out.println(mnum);
			
			mnum++;
		}
		
		// continue 는 건너뛰어 반복한다. 
		
		mnum = 0;
		
		while (mnum <= 9) {
			mnum++;
			if (mnum % 2 == 0)
				continue;
			
			System.out.println(mnum);
		}
		
		// break 는 반복문을 강제 종료한다. 
		
		mnum = 0;
		
		while (true) {
			mnum++;
			
			System.out.println(mnum);
			
			if (mnum >= 10)
				break;
		}		
		
	}
}
