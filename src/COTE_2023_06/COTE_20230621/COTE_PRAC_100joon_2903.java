package COTE_2023_06.COTE_20230621;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class COTE_PRAC_100joon_2903 {
	
	static Integer[] dp = new Integer[16];
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//중앙 이동 알고리즘
		
		// 0 	2	4
		// 1 	3	9
		// 2 	5	Math.pow( 3 +(3-1), 2 )
		// 3 	9	81
		// 4 	17	289
		// 5	33	1089
		
		
		dp[0] = 2;
		dp[1] = 3;
		
		for(int i = 2; i < dp.length; i++) {
			dp[i] = dp[i-1] + dp[i-1]-1;
		}
		
		System.out.println((int)Math.pow(dp[5], 2));
		
	}
	
}
