package COTE_2023_02.COTE_230213;

import java.util.Arrays;
import java.util.List;

public class COTE_PRAC_pgs2 {

	public static void main(String[] args) {

		int[] numArr = {1,2,3};
		//List<int[]> list = Arrays.asList(numArr);
		String dir = "left";
		
		int[] answer = Arrays.copyOf(numArr, numArr.length);
		if(dir.equals("right")) {
			for(int i = 1; i < answer.length; i++) {
				answer[i] = numArr[i-1];
			}
			answer[0] = numArr[answer.length-1];
		} else {
			for(int i = 0; i < answer.length-1; i++) {
				answer[i] = numArr[i+1];
			}
			answer[answer.length-1] = numArr[0];
			
		}
		//System.out.println(Arrays.asList(numArr).get(0)[0]);
		System.out.println(Arrays.toString(answer));
	}

}
