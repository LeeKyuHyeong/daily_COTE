package COTE_2023_03.COTE_230307;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class COTE_PRAC_pgs2 {

	public static void main(String[] args) {
		
		String s = "Zbcdefg";
//		List<Character> charList = new ArrayList<>();
//
//		for(int i = 0; i < s.length(); i++) {
//			charList.add(s.charAt(i));
//		}

		List<String> strList = new ArrayList<>();
		
		for(String str : s.split("")) {
			strList.add(str);
		}
		
		strList.sort(Comparator.reverseOrder());
		
		
		String answer = String.join("", strList);
		
		System.out.println(answer);
	}
	
}
