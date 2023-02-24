package COTE_2023_02.COTE_230214;

public class COTE_PRAC_pgs2 {

	public static void main(String[] args) {

		int n = 99;
		
		int slice = 6;
		
        int result = 1;
		
		while(slice % n != 0) {
			result++;
			//System.out.println("slice : " + slice + ", result : " + result + ", n : " + n );
			slice = 6 * result;
			
			
		}
        System.out.println(result);
		
	}

}
