package COTE_2023_08.COTE_20230820;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class COTE_PRAC_100joon_3221 {
	
	/**
WBWBWBWB
BWBWBWBW
WBWBWBWB
BWBBBWBW
WBWBWBWB
BWBWBWBW
WBWBWBWB
BWBWBWBW
	 * 
	 */
	
	
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String size = br.readLine();
		
		int x = Integer.parseInt(size.split(" ")[0]);
		int y = Integer.parseInt(size.split(" ")[1]);
		
		char chess[][] = new char[x][y]; 
		char tmpChess[] = new char[y];
		
		
		for(int i = 0; i < chess.length; i++) {
			System.out.println("i : " + chess[i].length);
			for(int j = 0; j < chess[i].length; j++) {
				
				String tiles = br.readLine();
				System.out.println("j : " + j + ", " + tiles.split("")[j]);
				tmpChess = tiles.toCharArray();
				//chess[i][j] = tiles.split("")[j];
				//System.out.println();
				System.out.println(Arrays.toString(tmpChess));
				chess[i][j] = tmpChess[j];
			}
			System.out.println(Arrays.deepToString(chess));
		}
		
		//System.out.println(Arrays.deepToString(chess));
		
	}
}
