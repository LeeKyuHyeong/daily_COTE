package COTE_2023_03.COTE_230308;

public class COTE_PRAC_pgs {

	public static void main(String[] args) {

		long before = System.currentTimeMillis();
		
		int answer = 0;
		
		int n = 3000;

		for(int i = 1; i <= Math.sqrt(n); i++) {
			
			if(n % i == 0) {
				answer += (i + (n / i));
				System.out.println(answer + ", i : " + i + ", n / i : " + (n / i));
			}
		}
		
//		System.out.println(sum);
		
		long after = System.currentTimeMillis();
		
		long dif = (after - before) / 1000L;
		
		System.out.println(dif);
		
		System.out.println("answer : " + answer);
		
	}

}
