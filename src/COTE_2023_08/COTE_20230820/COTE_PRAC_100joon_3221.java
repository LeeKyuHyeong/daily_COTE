package COTE_2023_08.COTE_20230820;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class COTE_PRAC_100joon_3221 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String size = br.readLine();
		
		int x = Integer.parseInt(size.split(" ")[0]);
		int y = Integer.parseInt(size.split(" ")[1]);
		
		char chess[][] = new char[x][y]; 
		
		
		
		for(int i = 0; i < chess.length; i++) {
			
			for(int j = 0; j < chess[i].length; j++) {
				String tiles = br.readLine();
				//chess[i] = tiles.toCharArray();
				System.out.println();
			}
			System.out.println(Arrays.deepToString(chess));
		}
		
		System.out.println(Arrays.deepToString(chess));
		
	}
}
