package COTE_2023_03.COTE_230302;

public class COTE_PRAC_pgs3 {

	public static void main(String[] args) {

		int a = 1, b = 50;
				
		int answer = 2;
		if(a % b == 0) {
            answer = 1;
        } else {
            b /= maxYaksoo(a, b);
            System.out.println(b);
		    
            if(b % 10 == 0) {
            	if(b == 100 || b == 1000) {
            		answer = 1;
            	} else if(b > 100) {
            		b /= 10;
            		if(b % 10 == 0) {
            			b /= 10;
            			if(twoBaesoo(b) || b % 10 == 5) {
            				answer = 1;
            			}
            		}
            	} else {
            		if(b == 50 || (b % 5 == 0 && (twoBaesoo(b/5) || (b / 5) % 10 == 5))) {
            			answer = 1;
            		}
            	}
            } else if(b == 5 || (b % 5 == 0 && (twoBaesoo(b/5) || (b / 5) % 10 == 5))) {
            	answer = 1;
            } else if(twoBaesoo(b)) {
            	answer = 1;
            }
        }
		System.out.println(answer);
		
	}
	static int maxYaksoo(int a, int b) {
		int result = 1;
		for(int i = 2; i <= a; i++) {
			if(b % i == 0 && a % i == 0) {
				result = i;
			}
		}
		return result;
	}
	static boolean twoBaesoo(int n) {
		
		for(int i = 1; i <= 10; i++) {
			if((int)Math.pow(2, i) == n) {
				return true;
			}
		}
		
		return false;
	}
}
