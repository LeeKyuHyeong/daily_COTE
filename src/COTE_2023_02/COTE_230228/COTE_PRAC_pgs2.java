package COTE_2023_02.COTE_230228;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class COTE_PRAC_pgs2 {

	public static void main(String[] args) {

		String[] spell = {"z", "d", "x"};
		//String[] spell = {"s", "o", "m", "d"};
		String patternInt = "^[0-9]*$";
		Map<String, String> map = new HashMap<>();
		
		int score = 1;
		int sum = 0;
		int tmp = 0;
		int result = 2;
		for(String s : spell) {
			sum += score;
			map.put(s, Integer.toString(score++));
			System.out.println(map.get(s));
		}
		int leng = spell.length;
		
		//String[] dic = {"moos", "dzx", "smm", "sunmmo", "som"};
		String[] dic = {"def", "dww", "dzx", "loveaw"};
		for(int i = 0; i < dic.length; i++) {
			if(dic[i].length() != leng) {
				continue;
			}
			for(String s : map.keySet()) {
				dic[i] = dic[i].replaceAll(s, map.get(s));
			}
			for(String str : dic[i].split("")) {
				if(!Pattern.matches(patternInt, str)) {
					continue;
				}
				tmp += Integer.parseInt(str);
				if(sum == tmp) {
					result = 1;
				}
			}
		}
		System.out.println(Arrays.toString(dic));
		System.out.println(result);
//		List<String> strList = new ArrayList<>();
//		
//		for(String s : dic) {
//			if(s.length() == leng) {
//				strList.add(s);
//			}
//		}
		
		
		
		
		
		
		
		
		
	}

}
