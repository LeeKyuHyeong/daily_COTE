package COTE_2023_02.COTE_230227;

import java.util.Arrays;

public class COTE_PRAC_pgs4 {

	public static void main(String[] args) {

		int[] numbers = {1,2,3,4,5,6};
		int k = 5;
		int length = numbers.length / 2;

		int[] answer = new int[1000];

		if(numbers.length % 2 == 0) {
			int[] tmpArr = new int[numbers.length / 2];
			for(int i = 0; i < tmpArr.length; i++) {
				int tmp = i % length;
				tmpArr[i] = numbers[2 * tmp];
			}
			for(int i = 0; i < answer.length; i++) {
				int tmp = i % length;
				answer[i] = tmpArr[tmp];
			}
			System.out.println(Arrays.toString(answer));
		} else {
			int[] tmpArr = new int[numbers.length];
			
			for(int i = 0; i < tmpArr.length; i++) {
				if(i <= tmpArr.length / 2) {
					tmpArr[i] = numbers[2 * i];
				} else {
					tmpArr[i] = numbers[(2 * i) - tmpArr.length];
				}
			}
			for(int i = 0; i < answer.length; i++) {
				int tmp = i % tmpArr.length;
				answer[i] = tmpArr[tmp];
			}
			System.out.println(Arrays.toString(answer));
		}
		
		System.out.println(answer[k-1]);
		
		
	}

}
