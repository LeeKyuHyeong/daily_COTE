package COTE_2023_06.COTE_20230612;

import java.util.Scanner;

public class COTE_PRAC_100joon_11726 {
	
	static Integer[] dp = new Integer[1001];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		dp[1] = 1;
		dp[2] = 2;
		/*
		 n == 1
		 sq(n) == 1
		 
		 n == 2
		 sq(n) == 2
		 
		 n == 3
		 sq(n) == 3
		 
		 n == 4
		 sq(n) == 5
		 
		 n == 5
		 sq(n) == 8
		  
		 */
		sq(n);
		
		System.out.println(dp[n]);
		
	}
	
	static int sq(int n) {
		if(n < 3) {
			return n;
		} else if(dp[n] == null){
			dp[n] = (sq(n-2) + sq(n-1)) % 10007;
		}
		//System.out.println("n : " + n + ",dp[n] :" + + dp[n]);
		
		return dp[n];
	}

}
