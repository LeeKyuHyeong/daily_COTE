package COTE_2023_01.COTE_230104;

import java.util.Arrays;

public class COTE_PRAC_pgs {

	public static void main(String[] args) {

		String str = "Python";
		
		char[] chArr = str.toCharArray();
		
		for(int i = 0; i < chArr.length; i++) {
			if(chArr[i] < 97 && chArr[i] > 64) {
				chArr[i] += 32;
			}
		}
		
		Arrays.sort(chArr);
		
		System.out.println(new String(chArr));
		
	}

}
