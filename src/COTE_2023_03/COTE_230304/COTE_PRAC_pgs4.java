package COTE_2023_03.COTE_230304;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class COTE_PRAC_pgs4 {

	public static void main(String[] args) {

		int[][] lines = {
				{3, 9},
				{-1, 2}, 
				{2, 3}
		};
		
		int answer = 0;
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < lines.length; i++) {
			
			for(int j = lines[i][0]; j <= lines[i][1]; j++) {
				
				map.put(j, map.getOrDefault(j, 0) + 1);
				
			}
		}
		
		List<Integer> intList = new ArrayList<>();
		
		for(Integer i : map.keySet()) {
			if(map.get(i) != 1)
				intList.add(i);
		}
		System.out.println(intList);
		answer = intList.get(intList.size()-1) - intList.get(0);
		
		System.out.println(answer);
		
	}

}
