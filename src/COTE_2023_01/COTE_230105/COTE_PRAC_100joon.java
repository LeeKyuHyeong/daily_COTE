package COTE_2023_01.COTE_230105;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class COTE_PRAC_100joon {

	public static void main(String[] args) {

		String[][] strArr = new String[13][2];
		
		strArr[0][0] = "LeeGJ"; 
		strArr[0][1] = String.valueOf("LeeGJ".length()); 
		
		strArr[1][0] = "LeeSin";
		strArr[1][1] = String.valueOf("LeeSin".length());
		
		strArr[2][0] = "LeeS";
		strArr[2][1] = String.valueOf("LeeS".length()); 
		
		System.out.println(Arrays.deepToString(strArr));
		
		Arrays.sort(strArr);
		
		System.out.println(Arrays.deepToString(strArr));
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("LeeGJ", 2);
		map.put("LeeKH", 9);
		map.put("KimKH", 0);
		map.put("SeoBS", 1);
		
		//System.out.println(map.keySet());
		//System.out.println(map.get("LeeGJ"));
	}

}
