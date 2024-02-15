package COTE_2023_10.COTE_20231003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

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
				if(input.split("")[j].equals("W")) {
					arr[i][j] = true;
				} else {
					//arr[i][j] = false;
				}
			}
		}
		
		int x_ = N - 7;
		int y_ = M - 7;
		
		for(int i = 0; i < x_; i++) {
			for(int j = 0; j < y_; j++) {
				find(i, j);
			}
		}
		
		System.out.println(MIN);
		
	}
	public static void find(int x, int y) {
		int endX = x + 8;
		int endY = y + 8;
		
		boolean std = arr[x][y];
		
		int cnt = 0;
		
		for(int i = x; i < endX; i++) {
			for(int j = y; j < endY; j++) {
				if(arr[i][j] == std) {
					
				} else {
					cnt++;
				}
				std = (!std);
			}
			std = !std;
		}
		
		MIN = Math.min(MIN, Math.min(cnt, 64 - cnt));
	}
}
