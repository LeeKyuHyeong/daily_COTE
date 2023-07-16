package COTE_2023_07.COTE_20230707;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class COTE_PRAC_100joon_14215 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int num1 = Integer.parseInt(str.split(" ")[0]);
		int num2 = Integer.parseInt(str.split(" ")[1]);
		int num3 = Integer.parseInt(str.split(" ")[2]);
		
		int MAX = 0;
		
		int MIN = 0;
		
		if(num1 > num2) {
			if(num2 > num3) {
				MAX = num1;
				MIN = num3;
			}
		}
		
	}
}
