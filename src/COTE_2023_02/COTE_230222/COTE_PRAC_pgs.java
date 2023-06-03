package COTE_2023_02.COTE_230222;

import java.util.Arrays;

public class COTE_PRAC_pgs {

	public static void main(String[] args) {

//		int[] intArr = {1,2,3,4,5,6,7,8};
//		int n = 2;
		int[] intArr = {1,2,3,4,5,6,7,8,9};
		int n = 3;
		
		int leng = intArr.length / n;
		
		int[][] answer = new int[leng][n];
		
		for(int i = 0; i < answer.length; i++) {
			for(int j = 0; j < answer[i].length; j++) {
				answer[i][j] = intArr[j + i*n];
				// answer [i][j] = intArr[j + i*n];
				// answer [0][0] = intArr[0];
				// answer [0][1] = intArr[1];
				// answer [1][0] = intArr[2];
				// answer [1][1] = intArr[3];
			}
		}
		System.out.println(Arrays.deepToString(answer));
	}

}
