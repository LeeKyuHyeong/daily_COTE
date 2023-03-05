package COTE_2023_03.COTE_230304;

import java.util.Arrays;

public class COTE_PRAC_pgs2 {

	public static void main(String[] args) {
		
		int n1 = 1, d1 = 2, n2 = 3, d2 = 4;
		int[] answer = new int[2];
		
		answer[0] = (n1 * d2) + (n2 * d1);
		answer[1] = d1 * d2;
		
		int MAX = answer[0] > answer[1] ? MAXyaksoo(answer[0], answer[1]) : MAXyaksoo(answer[1], answer[0]);
		if(MAX == 1) {
			
		} else {
			answer[0] /= MAX;
			answer[1] /= MAX;
		}
		
		System.out.println(Arrays.toString(answer));
	}
	
	static int MAXyaksoo(int a, int b) {
		int result = 1;
		
		for(int i = 2; i <= b; i++) {
			if(a % i == 0 && b % i == 0) {
				result = i;
			}
		}
		return result;
	}
	
}
