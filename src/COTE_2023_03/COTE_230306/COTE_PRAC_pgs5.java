package COTE_2023_03.COTE_230306;

public class COTE_PRAC_pgs5 {

	public static void main(String[] args) {

		//String s = "abcde";
		String s = "qwer";
		
		String answer = "";
		if(s.length() % 2 != 0) {
			answer = s.substring(s.length() / 2, s.length() / 2 + 1);
		} else {
			answer = s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
		}
		
		System.out.println(answer);
	}

}
