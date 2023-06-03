package COTE_2023_02.COTE_230210;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class COTE_PRAC_pgs {

	public static void main(String[] args) {

		String pattern = "^[0-9]*$"; // 숫자만 등장하는지
		String str = "p2o4i8gj2"; 
		
		List<Integer> intList = new ArrayList<>();
		
		for(String s : str.split("")) {
			if(Pattern.matches(pattern, s)) {
				intList.add(Integer.parseInt(s));
			}
		}
		
		Integer[] answer = intList.toArray(new Integer[0]);
		Arrays.sort(answer);
	}

}
