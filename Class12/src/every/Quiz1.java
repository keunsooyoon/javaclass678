package every;

public class Quiz1 {

	public static void main(String[] args) {
//		int day = 2;
//		
//		if (day == 1) {
//			System.out.println("월요일");
//		}else if (day == 2) {
//			System.out.println("화요일");
//		}else if (day == 3) {
//			System.out.println("수요일");
//		}
//		
//		String weeks = (day==1) ? "월요일" : (day==2) ? "화요일" : "수요일";
//
//		

		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*"+ j + "=" + i*j);
			}

		}
	}
}
