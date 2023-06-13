package COTE_2023_06.COTE_20230613;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class COTE_PRAC_100joon_2579 {
	
	static Integer dp[];
	static int arr[];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		dp = new Integer[n + 1];
		arr = new int[n + 1];
		
		for(int i = 1; i < dp.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		dp[0] = arr[0];
		dp[1] = arr[1];
		
		if(n >= 2) {
			dp[2] = arr[1] + arr[2];
		}
		
		System.out.println(find(n));
		/*
		 마지막은 무조건!
		 연속된 세개는 밟을 수 없다
		 한번에 한칸 또는 두칸
		 
		  10 20 15 25 10 20
		  
		  10 20 25 20
		  
		  10 15 25 20
		  
		  20 15 10 20
		  
		  20 25 20
		  ================
		  10 20 15 25 10 20 15
		  
		  10 20 25 10 15
		  
		  10 20 25 20 15
		  
		  10 15 25 20 15
		  
		  10 15 10 15
		  
		  20 15 10 15
		  
		  20 25 10 15
		  
		  20 25 20 15
		  ===============
		  0 1 2 3 4 5 6 7
		  
		  0 1 3 4 6 7
		  0 1 3 5 7
		  0 2 3 5 7
		  0 2 4 5 7
		  1 2 4 5 7
		  1 2 4 6 7
		  1 3 4 6 7
		  1 3 5 7
		  
		  7 6 5 4 3 2 1 0
		  
		  7+6 6+5 5+4
		  
		  dp[?] = Math.max( (마지막꺼 + 마지막꺼-1), (마지막꺼 + 마지막꺼-2) );
		  
		 */
		
		
		
	}
	static int find(int n) {
		
		if(dp[n] == null) {
			dp[n] = Math.max(find(n - 2), find(n - 3) + arr[n - 1]) + arr[n];
		}
		
		return dp[n];
	}
	
}
