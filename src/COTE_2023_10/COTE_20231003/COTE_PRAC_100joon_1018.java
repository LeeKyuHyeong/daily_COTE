package COTE_2023_10.COTE_20231003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class COTE_PRAC_100joon_1018 {
	
	public static boolean[][] arr;
	public static int MIN = 64;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int N = Integer.parseInt(str.split(" ")[0]);
		int M = Integer.parseInt(str.split(" ")[1]);
		
		arr = new boolean[N][M];
		
		for(int i = 0; i < N; i++) {
			String input = br.readLine();
			
			for(int j = 0; j < M; j++) {
				if(input.charAt(j) == 'W') {
					arr[i][j] = true;
				} else {
					arr[i][j] = false;
				}
			}
		}
		
		int N_row = N -7;
		int M_row = M -7;
		
		for(int i = 0; i < N_row; i++) {
			for(int j = 0; j < M_row; j++) {
				find(i, j);
			}
		}
		
		System.out.println(MIN);
		
		
	}
	
	public static void find(int x, int y) {
		int end_x = x + 8;
		int end_y = y + 8;
		int cnt = 0;
		
		boolean TF = arr[x][y];
		
		for(int i = x; i < end_x; i++) {
			
			for(int j = y; j < end_y; j++) {
				
				if(arr[i][j] != TF) {
					cnt++;
				}
				TF = (!TF);
			}
			TF = !TF;
		}
		cnt = Math.min(cnt, 64 - cnt);
		
		MIN = Math.min(MIN, cnt);
	}
}
