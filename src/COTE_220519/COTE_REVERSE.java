package COTE_220519;

import java.util.Arrays;

public class COTE_REVERSE {
	public static void main(String[] args) {
		
		long n = 125141321;
		char[] charArr = String.valueOf((int)n).toCharArray();
		
		int[] answer = new int[charArr.length];
		
		int tmp = 0;
		for(int i = 0; i < charArr.length; i++) {
			tmp = (int)n % 10;
			answer[i] = tmp;
			n /= 10;
		}
		System.out.println(Arrays.toString(answer));
	}
}
