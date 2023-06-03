package COTE_2023_03.COTE_230306;

import java.util.HashMap;
import java.util.Map;

public class COTE_PRAC_pgs3 {

	public static void main(String[] args) {

		int[] nums = {3, 1, 2, 3};
		
		int answer = 0;
		
		Map<Integer, Integer> map = new HashMap<>();
		
		int half = nums.length / 2;
		
		for(int i : nums) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}
		for(int j : map.keySet()) {
			if(map.get(j) > 0) {
				answer++;
			}
		}
		if(answer > half) {
			answer = half;
		}
		
		
		System.out.println(answer);
		
	}

}
