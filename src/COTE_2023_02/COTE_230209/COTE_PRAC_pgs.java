package COTE_2023_02.COTE_230209;

public class COTE_PRAC_pgs {

	public static void main(String[] args) {

		String str = "103";
		
		int answer = 0;
		
		for(String s : str.split("")) {
			if( Integer.parseInt(s) != 0 && Integer.parseInt(s) % 3 == 0) {
				answer++;
			}
		}
		System.out.println(answer);
	}

}
