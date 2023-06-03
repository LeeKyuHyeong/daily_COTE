package COTE_2023_02.COTE_230224;

import java.util.regex.Pattern;

public class COTE_PRAC_pgs {

	public static void main(String[] args) {
		String str = "a32";

		StringBuilder sb = new StringBuilder();
		
		String patternInt = "^[0-9]*$";
		
		int result = 0;
		
		for(String s : str.split("")) {
			if(Pattern.matches(patternInt, s)) {
				
				sb.append(s);
				System.out.println(sb.toString());
			} else {
				result += sb.toString().equals("") ? 0 : Integer.parseInt(sb.toString());
				sb.delete(0, sb.length());
				System.out.println(result);
			}
			
		}
		result += sb.toString().equals("") ? 0 : Integer.parseInt(sb.toString());
		System.out.println("최종 : " + result);
		
	}

}
