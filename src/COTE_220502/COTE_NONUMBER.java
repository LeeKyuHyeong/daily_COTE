package COTE_220502;

import java.util.HashMap;

public class COTE_NONUMBER {
	public static void main(String[] args) {
		
	}
}

class Solution {
	public int solution(int[] numbers) {
		int answer = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int j = 1; j < 10; j++) {
			map.put(j, 0);
		}		
		
		for(int i : numbers) {
			map.put(i, 1);
		}
		for(int k = 0; k < 10; k++) {
			if(map.get(k) == 0) {
				answer += k;
			} else {
				continue;
			}
		}
		return answer;
	}
}