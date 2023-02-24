package COTE_2023_02.COTE_230224;

import java.util.regex.Pattern;

public class COTE_PRAC_pgs {

	public static void main(String[] args) {
		String str = "1a2b30c4d123Z";

		StringBuilder sb = new StringBuilder();
		
		String patternInt = "^[0-9]*$";
		
		int result = 0;
		
		for(String s : str.split("")) {
			if(Pattern.matches(patternInt, s)) {
				sb.append(s);
			} else {
				result += sb.toString().equals("") ? 0 : Integer.parseInt(sb.toString());
				sb.delete(0, sb.length());
			}
			
		}
		
		System.out.println(result);
		
	}

}
