package COTE_2023_01.COTE_230125;

import java.util.Arrays;

public class COTE_PRAC_pgs {

	public static void main(String[] args) {

		int[] iArr = {1, 2, 3, 4, 5};
		
		int[] answer = new int[2];
		
		for(int i : iArr) {
			if(i % 2 == 0) {
				answer[0]++;
			} else {
				answer[1]++;
			}
		}
		
		System.out.println(Arrays.toString(answer));
	}

}
