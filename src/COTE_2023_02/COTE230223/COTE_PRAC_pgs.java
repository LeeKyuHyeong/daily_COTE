package COTE_2023_02.COTE230223;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class COTE_PRAC_pgs {

	public static void main(String[] args) {
		int[] emergency = {1,2,3,4,5,6,7};
		
		int[] tmpEmer = emergency.clone();
		Arrays.sort(tmpEmer);
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < tmpEmer.length; i++) {
			map.put(tmpEmer[i], tmpEmer.length -i);
		}
		
		int[] answer = new int[emergency.length];
		for(int j = 0; j < answer.length; j++) {
			answer[j] = map.get(emergency[j]);
		}
		
		
		System.out.println(Arrays.toString(answer));
	}

}
