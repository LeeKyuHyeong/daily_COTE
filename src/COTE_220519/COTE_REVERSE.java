package COTE_220519;

import java.util.Arrays;

public class COTE_REVERSE {
	public static void main(String[] args) {
		
		long n = 125141321;
		char[] charArr = String.valueOf((int)n).toCharArray();
		
		long[] answer = new long[charArr.length];
		
		long tmp = 0;
		for(int i = 0; i < charArr.length; i++) {
			tmp = n % 10;
			answer[i] = tmp;
			n /= 10;
		}
		System.out.println(Arrays.toString(answer));
	}
}
