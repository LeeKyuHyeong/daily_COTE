package COTE_220519;

public class COTE_ROOT {
	public static void main(String[] args) {
		long n = 44;
//		long answer = 0;
		
//		double num = Math.sqrt(n);
//		System.out.println(num);
//		
//		if(n == 1) {
//			answer = -1;
//		} else {
//			for(int i = 1; i <= n; i++) {
//				if(n / i == i) {
//					answer = (i+1) * (i+1);
//					break;					
//				}
//				answer = -1;
//			}
//		}
		
		long m = Math.pow((int)Math.sqrt(n), 2) == n ? (long)Math.pow(Math.sqrt(n) + 1, 2) : -1;
		
		System.out.println(m);
	}
}
