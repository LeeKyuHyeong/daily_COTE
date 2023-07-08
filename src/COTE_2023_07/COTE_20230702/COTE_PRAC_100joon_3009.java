package COTE_2023_07.COTE_20230702;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class COTE_PRAC_100joon_3009 {

	public static void main(String[] args) throws IOException{
		
		/**
		 * 												l
		 * 												l
		 * 												l          y    answer
		 * 												l
		 * 												l          x    z
		 * 												l
		 * 												l
		 * 												l
		  												l          		
		  				----------------------------------------------------------------																			
		  												l
		  												l
		  												l
		  												l
		  												l
		  												l
		  												l
		  												l
		  												l
		 * 
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] x = new int[3];
		int[] y = new int[3];
		
		for(int i = 0; i < 3; i++) {
			String input = br.readLine();
			x[i] = Integer.parseInt(input.split(" ")[0]);
			y[i] = Integer.parseInt(input.split(" ")[1]);
		}
		
		System.out.println(lastDot(x) + " " + lastDot(y));
		
		
	}
	
	static int lastDot(int[] intArr) {
		
		Map<Integer, Integer> map = new HashMap<>();
		
		int result = 0;
		
		for(int i : intArr) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		
		for(int i : map.keySet()) {
			if(map.get(i) == 1) {
				result = i;
			}
		}
		
		return result;
		
	}
	
}
