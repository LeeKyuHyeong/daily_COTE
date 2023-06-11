package COTE_2023_05.COTE_230521;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class COTE_PRAC_100joon {
	
	static Integer[] dp0;
	static Integer[] dp1;
	
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cycle = Integer.parseInt(br.readLine());
		
		int tmp = 0;
		
		int[][] answer = new int[cycle][2];
		
		while(cycle > tmp) {

			int n = Integer.parseInt(br.readLine());
			
			answer[tmp][0] = fn0(n);
			answer[tmp][1] = fn1(n);
			
			tmp++;
		}
		
		for(int i = 0; i < answer.length; i++) {
			System.out.println(answer[i][0] + " " + answer[i][1]);
		}
		
	}
	static int fn0(int n) {
		
//		if(dp0[n] == null) {
//			dp0[n] = dp0[n-2] + dp0[n-1];			
//		}
		if(n == 0) {
			return 1;
		}
		if(n == 1) {
			return 0;
		}
		
		//return dp0[n] = dp0[n-2] + dp0[n-1];
		return fn0(n-2) + fn0(n-1);
	}
	static int fn1(int n) {

		if(n == 0) {
			return 0;
		}
		if(n == 1) {
			return 1;
		}
		
		
		return fn1(n - 1) + fn1(n - 2);
		
	}
	
}
