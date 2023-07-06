package am;

import java.util.Arrays;
import java.util.Scanner;

public class HashSeachAll {
	
	public static int[] save(int[] arrD) {
		
		int num = arrD.length * 2;
		int[] arrH = new int[num];
		int k;
		for (int i = 0; i < arrD.length; i++) {
			k = arrD[i] % num;
			
			while(true) {
			if (arrH[k] == 0) {
				arrH[k] = arrD[i];
				break;
			} else {
				k = (k+1) % num;
			}
			}
			
		}
	System.out.println(Arrays.toString(arrD));	
	System.out.println(Arrays.toString(arrH));	
	return arrH;
		
	}
	public static int search(int[] arrH, int x) {
		
		int k = x % arrH.length;
		
		while (arrH[k] != 0) {
			
			if(arrH[k]== x) {
				//System.out.println("찾는값 x는"+ k +"번째에 있습니다.");
				return k;
			}else {
				k = (k+1) % 11;
			}
		}
		return -1;		
	}
	
	public static int[] input() {
		//몇 개의 배열을 만들까요? 3
		//배열 1 에는 어떤 수를 담을까요? 4
		//배열 2 에는 어떤 수를 담을까요? 6
		//배열 3 에는 어떤 수를 담을까요? 5
		//arrD = {4,6,5};
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("몇 개의 배열을 담을까요 ? ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i = 0; i < num; i ++) {
		System.out.print("배열" + (i+1) + "에는 어떤 수를 담을까요? ");
		int x = sc.nextInt();
		
		arr[i] = x;
		
		}
		return arr;
	}
	

	public static int findx() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열에서 찾으시는 숫자를 입력하세요 ? ");
		int x = sc.nextInt();
		
		return x;
	}
	
	public static void main(String[] args) {

		int[] arrD = input();
		int[] arrH = save(arrD);
		int x = findx();
		int k = search(arrH,x);
		if (k == -1) {
			System.out.println("찾으시는 값이 배열에 존재하지 않습니다.");
		} else {
			System.out.println("찾으시는 "+x+"은 "+ k + "번째에 있습니다.");
		}
	}
}
