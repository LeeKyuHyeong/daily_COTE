package COTE_2023_08.COTE_20230820;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class COTE_PRAC_100joon_3221 {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Scanner sc = new Scanner(System.in);
		
		String size = br.readLine();
		
		int x = Integer.parseInt(size.split(" ")[0]);
		int y = Integer.parseInt(size.split(" ")[1]);
		
		String chess[][] = new String[x][y]; 
		
		for(int i = 0; i < x; i++) {
			String str = sc.nextLine();
			for(int j = 0; j < y; j++) {
				chess[i][j] = str.split("")[j];
			}
		}
		//System.out.println(Arrays.deepToString(chess));
		
		String std = chess[0][0];
		int MAX = (x - 7) * (y -7);
		int cnt = 0;
		int cycle = 0;
		int tmpX = 0;
		int tmpY = 0;
		System.out.println(MAX);
		while(cycle < MAX) {
			for(int i = tmpX; i < 8 + tmpX; i++) {
				
				for(int j = tmpX; j < 8 + tmpY; j++) {
					System.out.println(tmpX + ", " + tmpY + ", " + chess[i][j]);
					
					chess[i][j] = "";
					
					if(tmpY + 7 > y) break;
					tmpY++;
				}
				if(tmpX + 7 > x) break;
				tmpX++;
				tmpY = tmpX;
			}
			cycle++;
			tmpX = 0;
		}
		
		
	}
}
