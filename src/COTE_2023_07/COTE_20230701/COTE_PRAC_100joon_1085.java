package COTE_2023_07.COTE_20230701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class COTE_PRAC_100joon_1085 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		int x = Integer.parseInt(input.split(" ")[0]);
		int y = Integer.parseInt(input.split(" ")[1]);
		
		int w = Integer.parseInt(input.split(" ")[2]);
		int h = Integer.parseInt(input.split(" ")[3]);
		
		//System.out.println("x : " + x + ", y : " + y);
		//System.out.println("w : " + w + ", h : " + h);
		
		int answer = Math.min( Math.min(x-0,w-x), Math.min(y-0,h-y));
		
		System.out.println(answer);
		
	}
	
}
