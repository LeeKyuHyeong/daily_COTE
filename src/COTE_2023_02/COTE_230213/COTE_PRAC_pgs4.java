package COTE_2023_02.COTE_230213;

public class COTE_PRAC_pgs4 {

	public static void main(String[] args) {

		int n = 6;
		
		int people = 99;
		
		int result = 1;
		
		while(n % people != 0) {
			result++;
			
			n *= result;
			
			
		}
		System.out.println(result);
		
	}

}
