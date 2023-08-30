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
		//char tmpChess[] = new char[y];
		
		for(int i = 0; i < x; i++) {
			String str = sc.nextLine();
			//System.out.println(str);
			for(int j = 0; j < y; j++) {
				chess[i][j] = str.split("")[j];
			}
		}
		System.out.println(Arrays.deepToString(chess));
		
		
	}
}
