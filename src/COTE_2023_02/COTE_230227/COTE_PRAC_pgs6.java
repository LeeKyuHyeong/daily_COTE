package COTE_2023_02.COTE_230227;

public class COTE_PRAC_pgs6 {

	public static void main(String[] args) {

		int balls = 5;
		int share = 3;
		
		long ballsSum = 1L;
		long shareSum = 1L;
		
		for(int i = balls; i > balls-share; i--) {
			ballsSum *= i;
		}
		for(int i = share; i > 0; i--) {
			shareSum *= i;
		}
				
		
		System.out.println(ballsSum / shareSum);
		
	}
	
}
