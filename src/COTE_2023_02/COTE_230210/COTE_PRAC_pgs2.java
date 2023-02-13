package COTE_2023_02.COTE_230210;

import java.util.regex.Pattern;

public class COTE_PRAC_pgs2 {

	public static void main(String[] args) {

		String pattern = "^[0-9a-zA-Z]*$";
		
		System.out.println(Pattern.matches(pattern, "231af!@s4"));
		
	}

}
