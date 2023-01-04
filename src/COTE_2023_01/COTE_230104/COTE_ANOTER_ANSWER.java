package COTE_2023_01.COTE_230104;

import java.util.Arrays;

public class COTE_ANOTER_ANSWER {

	public static void main(String[] args) {
		
		String str = "bAcd";
		
		char[] chArr = str.toLowerCase().toCharArray();
		
		Arrays.sort(chArr);
		
		System.out.println(new String(chArr));

	}

}
