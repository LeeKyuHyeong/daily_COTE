package COTE_2023_03.COTE_230306;

import java.util.HashMap;
import java.util.Map;

public class COTE_PRAC_pgs2 {

	public static void main(String[] args) {
		
		int[][] lines = {
				{0, 5},
				{3, 9},
				{1, 10}
		};

		int answer = 0;
		
		Map<String, Integer> map = new HashMap<>();
		
		for(int i = 0; i < lines.length; i++) {
			for(int j = lines[i][0]; j < lines[i][1]; j++) {
				map.put((Integer.toString(j) + "," + Integer.toString(j+1)), map.getOrDefault((Integer.toString(j) + "," + Integer.toString(j+1)), 0) + 1);
			}
		}
		
		for(String s : map.keySet()) {
			if(map.get(s) > 1) {
				answer++;
			}
		}
		
		System.out.println(answer);
		
	}
}
