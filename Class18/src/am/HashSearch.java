package am;

import java.util.Arrays;

public class HashSearch {

	public static void main(String[] args) {
		int[] arrD = {12,25,36,20,30,8,42};
		int[] arrH = new int[11];
		int k;
		for (int i = 0; i < 7; i++) {
			k = arrD[i] % 11;
			
			while(true) {
			if (arrH[k] == 0) {
				arrH[k] = arrD[i];
				break;
			} else {
				k = (k+1) % 11;
			}
			}
			
		}
	System.out.println(Arrays.toString(arrD));	
	System.out.println(Arrays.toString(arrH));	
	}
}
