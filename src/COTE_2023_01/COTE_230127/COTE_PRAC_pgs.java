package COTE_2023_01.COTE_230127;

public class COTE_PRAC_pgs {

	public static void main(String[] args) {

		String str = "jaron";
		
		char[] answer = new char[str.length()];
		
		for(int i = 0; i < str.length(); i++) {
			answer[str.length() - 1 - i] = str.charAt(i);
		}
		System.out.println(new String(answer));
		
		String str1 = "standard";
		
		System.out.println(new StringBuilder(str1).reverse().toString());
	}

}
