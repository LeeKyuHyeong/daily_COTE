package COTE_2023_10.COTE_20231005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class COTE_PRAC_100joon_1181 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cycle = Integer.parseInt(br.readLine());
		
		int tmp = 0;
		
		String str[] = new String[cycle];
		
		while(cycle > tmp) {
			
			str[tmp] = br.readLine();
			
			tmp++;
		}
		
		for(String s : str) {
			System.out.println(s);
		}
		
	}
}
