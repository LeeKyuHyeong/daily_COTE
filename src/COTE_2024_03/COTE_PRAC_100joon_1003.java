package COTE_2024_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class COTE_PRAC_100joon_1003 {
	
	static int[][] intArr;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cycle = Integer.parseInt(br.readLine());
		
		intArr = new int[2][cycle];
		
//		intArr[0][0] = 1;
//		intArr[0][1] = 0;
		
//		intArr[1][0] = 0;
//		intArr[1][1] = 1;
		
		for(int i = 0; i < cycle; i++) {
			makeArr(Integer.parseInt(br.readLine()), i);
		}
		
	}
	
	public static void makeArr(int a, int b) {
		int zeroCnt = 0;
		int oneCnt = 0;
		
		if(a == 0 || a == 1) {
			return;
		}

		//
	
	}
}
