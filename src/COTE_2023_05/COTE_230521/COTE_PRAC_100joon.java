package COTE_2023_05.COTE_230521;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class COTE_PRAC_100joon {
	
	static Integer[][] dp = new Integer[41][2];
	
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cycle = Integer.parseInt(br.readLine());
		
		int tmp = 0;
		
		int[][] answer = new int[cycle][2];
		
		dp[0][0] = 1;
		dp[0][1] = 0;
		dp[1][0] = 0;
		dp[1][1] = 1;
		
		while(cycle > tmp) {

			int n = Integer.parseInt(br.readLine());
			fib(n);
			
			answer[tmp][0] = dp[n][0];
			answer[tmp][1] = dp[n][1];
			
			tmp++;
		}
		
		for(int i = 0; i < answer.length; i++) {
			System.out.println(answer[i][0] + " " + answer[i][1]);
		}
		
	}
	static Integer[] fib(int n) {
		if(dp[n][0] == null || dp[n][1] == null) {
			dp[n][0] = fib(n-2)[0] + fib(n-1)[0];
			dp[n][1] = fib(n-2)[1] + fib(n-1)[1];
		}
		return dp[n];
	}
	
}
