package COTE_2023_02.COTE_230206;

import java.util.Arrays;

public class COTE_PRAC_pgs {

	public static void main(String[] args) {

		int[] arr = {9, 10, 11, 8};
		
		int[] answer = new int[2];
		
		int MAX = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > MAX) {
				MAX = arr[i];
				answer[0] = MAX;
				answer[1] = i;
			}
		}
		
		System.out.println(Arrays.toString(answer));
		
	}

}
