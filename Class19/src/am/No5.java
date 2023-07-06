package am;

import java.util.Arrays;

public class No5 {

	public static void main(String[] args) {
		int []arrD = {12, 25, 36, 20};
		 int []arrH = new int[8];
		 int k;
		 
		 for (int i =0;i<4;i++) {
			 k= arrD[i]%8;
			 while(true) { 
			 if(arrH[k]==0) {
			arrH[k]=arrD[i];
			break;
			 }else {
				   k=(k+1)%8;
					}	
				
		 }
		

	}
		 System.out.println(Arrays.toString(arrD));
			System.out.println(Arrays.toString(arrH));
}
}
