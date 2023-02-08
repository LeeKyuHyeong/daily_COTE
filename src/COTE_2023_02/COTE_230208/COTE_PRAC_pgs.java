package COTE_2023_02.COTE_230208;

import java.util.Map;
import java.util.TreeMap;

public class COTE_PRAC_pgs {

	public static void main(String[] args) {

		String s = "aepifsozc";

		StringBuilder sb = new StringBuilder();

		Map<String, Integer> map = new TreeMap<>();
		
		for(String str : s.split("")) {
			map.put(str, (map.getOrDefault(str, 0))+1);
		}
		
		for(String str : map.keySet()) {
			if(map.get(str) == 1) 
				sb.append(str);
		}
		
		System.out.println(sb.toString());
	}

}
