package COTE_2023_06.COTE_20230607;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class COTE_PRAC_100joon {

	static Integer[] dp = new Integer[11];
	
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cycle = Integer.parseInt(br.readLine());
		
		int tmp = 0;
		
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		
		int[] answer = new int[cycle];
		
		while(cycle > tmp) {

			int n = Integer.parseInt(br.readLine());
			
			answer[tmp] = fn(n);
			
			tmp++;
		}
		
		for(int i : answer) {
			System.out.println(i);
		}
		
	}
	static int fn(int n) {
		
		for(int i = 4; i <= 10; i++) {
			dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
		}
		return dp[n];
		
	}
	
}
