package COTE_2023_07.COTE_20230704;

import java.io.*;
import java.util.Arrays;

public class COTE_PRAC_100joon_9063 {
	
	static int[] x;
	static int[] y;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cycle = Integer.parseInt(br.readLine());

		int tmp = 0;
		
		x = new int[cycle];
		y = new int[cycle];
		
		while(cycle > tmp) {
			
			String inputStr = br.readLine();
			
			x[tmp] = Integer.parseInt(inputStr.split(" ")[0]);
			y[tmp] = Integer.parseInt(inputStr.split(" ")[1]);
			
			tmp++;
		}
		
		Arrays.sort(x);
		Arrays.sort(y);
		
		System.out.println( (x[cycle-1] - x[0]) * (y[cycle-1] - y[0]));
		
		
	}
}
