package COTE_2023_06.COTE_20230619;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class COTE_PRAC_100joon_2720 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cycle = Integer.parseInt(br.readLine());
		
		int tmp = 0;
		
		while(cycle > tmp) {
			
			int n = Integer.parseInt(br.readLine());
			
			System.out.println(n / 25 + " " + (n % 25) / 10 + " " + ((n % 25) % 10) / 5 + " " + (((n % 25) % 10) % 5) / 1);
			
			tmp++;
		}
	}
	
}
