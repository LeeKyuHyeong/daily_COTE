package COTE_2023_06.COTE_20230611;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class COTE_PRAC_100joon_1149 {

	static Integer[][] dp;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cycle = Integer.parseInt(br.readLine());
		
		int tmp = 0;
		
		/*
		 	R	G	B		
		 1	26	40	83
		 			
		 2	49	60	57
		 	89 (132)	86 (143) 83 (97)
		 	
		 3	13	89	99
		 	(99)96	(178)	172 (188)	185
		 =================================						
		 1	1	100	100						
		 						
		 						
		 2	100	1	100					
		 	200 (200) 2 (101) 101 (200)
		 						
		 3	100	100	1						
		 	102 (201)	300 (301)	(201) 3
		 	
		 1	1	100	100				
		 				
		 
		 2	100	100	100			
		 	200 (200) 101 (200) 101 (200)			
		 	
		 3	1	100	100
		 	102 (102) (300) 201 (300) 201
		 ===================================	
		 	
		 	
		 	
		 	
		 			
		 */
		
		dp = new Integer[cycle+1][3];
		
		
		int[] intArr = new int[3];
		while(cycle > tmp) {
			String input = br.readLine();
			for(int i = 0; i < intArr.length; i++) {
				intArr[i] = Integer.parseInt(input.split(" ")[i]);
			}
			rgb(intArr, tmp);
			
			//System.out.println(Arrays.toString(intArr));
			tmp++;
		}
		
		//System.out.println(dp[cycle][0]);
		
		int MIN = dp[cycle][0];
		
		for(int i = 1; i < dp[cycle].length; i++) {
			if(MIN > dp[cycle][i]) {
				MIN = dp[cycle][i];
			}
		}
		
		System.out.println("MIN : " + MIN);
	}
	static Integer[] rgb(int[] intArr, int tmp) {
		
		dp[0][0] = 0;
		dp[0][1] = 0;
		dp[0][2] = 0;
		
		dp[tmp+1][0] = Math.min( (intArr[0] + dp[tmp][1]), (intArr[0] + dp[tmp][2]));
		dp[tmp+1][1] = Math.min( (intArr[1] + dp[tmp][0]), (intArr[1] + dp[tmp][2]));
		dp[tmp+1][2] = Math.min( (intArr[2] + dp[tmp][1]), (intArr[2] + dp[tmp][0]));
		
		return dp[tmp+1];
	}
}
