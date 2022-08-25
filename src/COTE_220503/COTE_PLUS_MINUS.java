package COTE_220503;

import java.util.HashMap;

public class COTE_PLUS_MINUS {

	Solution s = new Solution();
}
class Solution {
	public int solution(int[] absolutes, boolean[] signs) {

//		HashMap<Integer, Boolean> map = new HashMap<>();
//		for(int i = 0; i < absolutes.length; i++) {
//			map.put(absolutes[i], signs[i]);
//		}
		/*
		 int result = 0;
		 for(int i = 0; i < absolutes.length; i++){
		 	result += absolutes[i] * (signs[i] ? 1 : -1);
		 }
		 
		 */
		
		int sum = 0;
		for(int i = 0; i < signs.length; i++) {
			if(!signs[i]) {
				absolutes[i] = 0 - absolutes[i];
			}
			
			sum += absolutes[i];
		}
		
		
		return sum;
	}
}