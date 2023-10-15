package COTE_2023_10.COTE_20231003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class COTE_PRAC_100joon_1018 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String tiles = br.readLine();
		
		int N = Integer.parseInt(tiles.split(" ")[0]);
		int M = Integer.parseInt(tiles.split(" ")[1]);
		
		String strArr[][] = new String[N][M];
		
//		System.out.println(Arrays.deepToString(strArr));
		
		for(int i = 0; i < N; i++) {
			String input = br.readLine();
			for(int j = 0; j < M; j++) {
				strArr[i][j] = input.split("")[j];
			}
		}
		//System.out.println(Arrays.deepToString(strArr));
		
		int MIN = 64;
		
		//한줄 안
		int cycle = 0;
		for(int i = 0; i < N - 7; i++) {
			//세로 한칸 아래
			
			for(int j = 0; j < M - 7; j++) {
				//가로 한칸 오른쪽
				
				String[][] eachStrArr = new String[8][8];
				for(int k = i; k < i + 8; k++) {
					// 세로 반복
					
					for(int l = j; l < j + 8; l++) {
						// 가로 반복
						//System.out.print("k : " + k + ", l : "+ l + ",strArr[k][l] : " + strArr[k][l] + "\t");
						eachStrArr[k-i][l-j] = strArr[k][l];
						
					}
					//가로반복 끝
				}
				//세로반복 끝 (한개 8*8 완성)
				cycle++;
				System.out.print(cycle + "번 " + Arrays.deepToString(eachStrArr) + "\t");
				//System.out.println(cycle + "번 " + minRepair(eachStrArr));
				MIN = Math.min(minRepair(cycle, eachStrArr), MIN);
				System.out.println(MIN);
			}
			
		}
		
		/*
		 BBWBWBWW
		 BWBWBWBW
		 WBWBWBWB
		 
		 
		 
		 
		 WWBWBWBB
		 WBWBWBWB
		 */
		
		
		
		
		
		System.out.println(MIN);
		
		
		
		
		
	}
	public static int minRepair(int cycle, String[][] arr) {
		
		int changeStart = 0;
		int changeSecond = 0;
		
		boolean toggle = true;
		
		String startStr = arr[0][0];
		
		String otherStr = startStr.equals("W") ? "B" : "W";
		
		for(int i = 0; i < arr.length; i++) {
			
			String tmp = "";
			tmp = startStr;
			startStr = otherStr;
			otherStr = tmp;
			
			for(int j = 0; j < arr[i].length; j++) {
				//System.out.println("i : " + i + ", j : "+ j + ",arr[i][j] : " + arr[i][j] + ",toggle : " + toggle);
				
				if(!toggle && arr[i][j].equals(startStr)) {
					changeStart++;
				} else if(toggle && arr[i][j].equals(otherStr)) {
					changeStart++;
				}
				
				//toggle = !toggle;
			}
			toggle = !toggle;
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println("i : " + i + ", j : "+ j + ",arr[i][j] : " + arr[i][j] + ",toggle : " + toggle);
				
				if(!toggle && arr[i][j].equals(startStr)) {
					changeSecond++;
				} else if(toggle && arr[i][j].equals(otherStr)) {
					changeSecond++;
				}
				
				//toggle = !toggle;
			}
			toggle = !toggle;
		}
		
		
		return Math.min(changeStart, changeSecond);
	}
}
