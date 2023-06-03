package COTE_2023_03.COTE_230304;

import java.util.Arrays;

public class COTE_PRAC_pgs {

	public static void main(String[] args) {

		int answer = 0;
		
		int[] array = {0, 0, 0, 0, 0, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4};
		
		int MAX = -1;
		int duple = 0;
		int tmp = 0;
		if(array.length == 1) {
			answer = array[0];
		} else {
			int[] newArr = new int[1000];
			for(int i = 0; i < newArr.length; i++) {
				newArr[i] = 0;
			}
			for(int j = 0; j < array.length; j++) {
				newArr[array[j]]++;
				if(newArr[array[j]] > MAX) {
					MAX = newArr[array[j]];
					tmp = array[j];
					duple = 0;
				} else if(newArr[array[j]] == MAX) {
					duple++;
				}
			}
			if(duple > 0) {
				answer = -1;
			} else {
				answer = tmp;
			}
		}
		
		
		System.out.println(answer);
	}

}
