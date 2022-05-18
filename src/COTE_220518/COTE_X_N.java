package COTE_220518;

import java.util.Arrays;

public class COTE_X_N {
	
	public static void main(String[] args) {
		int x = -10000;
		int n = 999;
		long tmp = x;
		long[] answer = new long[n];
		
		for(int i = 0; i < n; i++, tmp+=x) {
			answer[i] = tmp;			
		}
		System.out.println(Arrays.toString(answer));
			
		
	}
}
