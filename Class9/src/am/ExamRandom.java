package am;

//import java.util.Random;  // 난수 발생
//import java.util.Scanner; // 키보드 입력 
import java.util.*;

public class ExamRandom {

	public static void main(String[] args) {
		Random random = new Random();
		
		//임의의 정수 발생 (범위가 너무 크다)
		System.out.println(random.nextInt());
		
		//0~100미만(100포함 안됨)
		System.out.println(random.nextInt(100));
		
		//0.0 ~ 1.0
		System.out.println(random.nextDouble());
		
		//한자리의 양의 정수를 난수로 발생시켜보자, 0 제외
		System.out.println(1 + random.nextInt(9));


	}

}
