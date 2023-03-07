package COTE_2023_03.COTE_230307;

public class COTE_PRAC_pgs4 {

	public static void main(String[] args) {

		String str = "a B z";
		int n = 4;
		char[] chArr = str.toCharArray();
		
		for(int i = 0; i < chArr.length; i++) {
			if(chArr[i] == ' ') {
				continue;
			}
			for(int j = 1; j < n; j++) {
				
				if(chArr[i] == 'z' || chArr[i] == 'Z') {
					chArr[i] = (char)((int)chArr[i] - 26);
				} else {
					chArr[i] = (char)((int)chArr[i] + 1);
				}
			}
			
			System.out.println(chArr[i]);
		}
		
		String answer = new String(chArr);
		
		System.out.println(answer);
	}

}
