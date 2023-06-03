package COTE_2023_02.COTE_230221;

public class COTE_PRAC_pgs {

	public static void main(String[] args) {

		int n = 119;
		long result = 0L;
		for(int i = 1; i <= 10; i++) {
			if(fact(i) == n) {
				result = i;
			} else {
				if(fact(i) < n)
					result = i;
			}
		}
		
		System.out.println(result);
		
	}
	static long fact(int n) {
		
		return n == 0 ? 1 : n * fact(n-1);
	}
}
