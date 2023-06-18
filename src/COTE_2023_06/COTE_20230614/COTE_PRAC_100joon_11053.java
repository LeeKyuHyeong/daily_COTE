package COTE_2023_06.COTE_20230614;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class COTE_PRAC_100joon_11053 {
	
	static int[] seq;
	static Integer[] dp;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		seq = new int[n];
		dp = new Integer[n];
		
		String num = br.readLine();
		
		for(int i = 0; i < n; i++) {
			seq[i] = Integer.parseInt(num.split(" ")[i]);
		}
		
		for(int i = 0; i < n; i++) {
			LIS(n);
		}
		
		int max = dp[0];
		
		for(int i = 0; i < n; i++) {
			max = Math.max(max, dp[i]);
		}
		System.out.println(max);
		
	}
	
	static int LIS(int n) {
		if(dp[n] == null) {
			dp[n] = 1; 
			
			for(int i = n - 1; i >= 0; i--) {
				if(seq[i] > seq[n]) {
					dp[n] = Math.max(dp[n], LIS(i) + 1);
				}
			}
		}
		return dp[n];
	}
}
