package COTE_2023_05.COTE_230520;

public class COTE_PRAC_pgs_181187 {

	public static void main(String[] args) {
		
		int a = 1, b = 4;
			
		//System.out.println(Math.sqrt(2) % 1);
		
		System.out.println(solution(a, b));
		
		
	}
	static long solution(int r1, int r2) {
        long answer = 0;
        
		for(int i = 1; i <= r2; i++) {
			System.out.println("i : " + i + ", Math.sqrt(1.0 * r1 * r1 - 1.0 * i * i) : " + Math.sqrt(1.0 * r1 * r1 - 1.0 * i * i));
			System.out.println("i : " + i + ", Math.sqrt(1.0 * r2 * r2 - 1.0 * i * i) : " + Math.sqrt(1.0 * r2 * r2 - 1.0 * i * i));
			
			long minJ = (int) Math.ceil(Math.sqrt(1.0 * r1 * r1 - 1.0 * i * i));
			long maxJ = (int) Math.floor(Math.sqrt(1.0 * r2* r2 - 1.0 * i * i));
			
			answer += (maxJ - minJ + 1);
			System.out.println(answer);
		}
        
        return answer * 4;
    }
}
