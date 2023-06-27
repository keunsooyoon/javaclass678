package pm;
import java.util.Random;

public class Quiz3 {
public static void main(String[] args) {
	
	Random random = new Random();
	int[] count = new int[6];
	
	//100반복
	
	int roll = random.nextInt(6) + 1; //1 ~ 6
	count[roll-1]++;   //배열은 0 ~ 5
	
	
	//출력
	
}
}
