package COTE_2023_02.COTE_230227;

import java.math.BigInteger;
import java.util.Arrays;

public class COTE_PRAC_pgs6 {

	public static void main(String[] args) {

		int balls = 30;
		int share = 15;
		int len = balls - share;
		int start= len;
		long answer = 1L;
		int div = 1;
		int[] ballsArr = new int[balls - share];
		int[] shareArr = new int[balls - share];
		
		for(int i = 0; i < len; i++) {
			ballsArr[i] = balls--;
			shareArr[i] = start--;
		}
		
		//System.out.println(Arrays.toString(ballsArr));
		//System.out.println(Arrays.toString(shareArr));
		
		for(int i = 0; i < len; i++) {
			
			for(int j = 0; j < len; j++) {
				
				if(ballsArr[i] % shareArr[j] == 0) {
					ballsArr[i] /= shareArr[j];
					shareArr[j] = 1;
				}
				
			}
		}
		//System.out.println(Arrays.toString(ballsArr));
		//System.out.println(Arrays.toString(shareArr));
		
		for(int b : ballsArr) {
			answer *= b;
		}
		for(int b : shareArr) {
			div *= b;
		}
		
		
		System.out.println((int)(answer / div));
		//return answer;
	}
	
}
