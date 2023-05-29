package COTE_2023_05.COTE_230520;

public class COTE_PRAC_pgs_181187 {

	public static void main(String[] args) {
		
		int a = 999999, b = 1000000;
				
		System.out.println(solution(a, b));
		
		
	}
	static long solution(int r1, int r2) {
        long answer = 0;
        try {
        	answer += ((r2 - r1) + 1) * 4;
        	
        	long w1 = (long)Math.pow(r1, 2);
        	long w2 = (long)Math.pow(r2, 2);
        	
        	long cnt = 0;
        	
        	for(int i = 1; i < r2; i++) {
        		
        		for(int j = 1; j < r2; j++) {
        			if( (long)Math.pow(i,2) + (long)Math.pow(j,2) >= w1 && (long)Math.pow(i,2) + (long)Math.pow(j,2) <= w2) {
        				cnt++;
        			}
        		}
        	}
        	
        	cnt *= 4;
        	
        	answer += cnt;
        	
        } catch(RuntimeException e) {
        	e.printStackTrace();
        } catch(StackOverflowError e) {
        	e.printStackTrace();
        } finally {
        	System.out.println(answer);
        }
        
        return answer;
    }
}
