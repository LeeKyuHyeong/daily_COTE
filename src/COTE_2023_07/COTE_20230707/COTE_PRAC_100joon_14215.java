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
		
		int MAX = Math.max(num1, Math.max(num2, num3));
		
		int MIN = Math.min(num1, Math.min(num2, num3));
		
		System.out.println("MAX : " + MAX + ", MIN : " + MIN);
		
	}
}
