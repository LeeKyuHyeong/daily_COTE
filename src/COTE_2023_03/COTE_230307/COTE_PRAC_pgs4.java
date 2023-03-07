package COTE_2023_03.COTE_230307;

import java.util.Arrays;

public class COTE_PRAC_pgs4 {

	public static void main(String[] args) {

		String str = "Z B z";
		int n = 25;
		char[] chArr = str.toCharArray();
		
		for(int i = 0; i < chArr.length; i++) {
			if(chArr[i] == ' ') {
				continue;
			}
			System.out.println(chArr[i]);
			if(chArr[i] == 'z' || chArr[i] == 'Z') {
				chArr[i] = (char)((int)chArr[i] - 26);
			}
			System.out.println(chArr[i]);
			chArr[i] = (char)((int)chArr[i] + 1);
			System.out.println(chArr[i]);
		}
		//System.out.println(Arrays.toString(chArr));
		
		String answer = new String(chArr);
		
		//System.out.println(answer);
	}

}
