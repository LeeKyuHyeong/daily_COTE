package COTE_2023_07.COTE_20230708;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class COTE_PRAC_100joon_19532 {
	public static void main(String[] args) throws IOException{
		System.out.println(4*2 + "x + " + 1);

		System.out.println("0" + 1);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String inputStr = br.readLine();
		
		int x = 0;
		int y = 0;
		
		int a = Integer.parseInt(inputStr.split(" ")[0]);
		int b = Integer.parseInt(inputStr.split(" ")[1]);
		int c = Integer.parseInt(inputStr.split(" ")[2]);
		int d = Integer.parseInt(inputStr.split(" ")[3]);
		int e = Integer.parseInt(inputStr.split(" ")[4]);
		int f = Integer.parseInt(inputStr.split(" ")[5]);
		
		for(int i = -999; i < 1000; i++) {
			for(int j = -999; j < 1000; j++) {
				if ((a * i) + (b * j) == c && (d * i) + (e * j) == f) {
					System.out.println(i + " " + j);
				}
			}
		}
		
	}
	
}
