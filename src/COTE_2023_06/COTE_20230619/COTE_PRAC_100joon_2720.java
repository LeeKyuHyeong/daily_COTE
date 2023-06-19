package COTE_2023_06.COTE_20230619;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class COTE_PRAC_100joon_2720 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cycle = Integer.parseInt(br.readLine());
		
		int tmp = 0;
		
		int[][] answer = new int[cycle][4];
		
		while(cycle > tmp) {
			
			int n = Integer.parseInt(br.readLine());
			
			answer[tmp][0] = n / 25;
			answer[tmp][1] = (n % 25) / 10;
			answer[tmp][2] = ((n % 25) % 10) / 5;
			answer[tmp][3] = (((n % 25) % 10) % 5) / 1;
			
			tmp++;
		}
		
		System.out.println(Arrays.deepToString(answer));
	}
	
}
