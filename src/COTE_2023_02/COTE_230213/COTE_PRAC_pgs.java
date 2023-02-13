package COTE_2023_02.COTE_230213;

public class COTE_PRAC_pgs {

	public static void main(String[] args) {
		String str = "people";
		
		StringBuilder sb = new StringBuilder();
		
		for(String s : str.split("")) {
			System.out.println(sb.indexOf(s));
			if(sb.indexOf(s) == -1) {
				sb.append(s);
			}
		}
		
		
		System.out.println(sb.toString());
		
	}

}
