package COTE_2023_02.COTE_230202;

public class COTE_PRAC_pgs {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		
		String str = "hello";
		
		int N = 3;
		
		for(int i = 0; i < str.length(); i++) {
			for(int j = 0; j < N; j++) {
				sb.append(str.charAt(i));
			}
		}
		
		System.out.println(sb);
		
	}

}
