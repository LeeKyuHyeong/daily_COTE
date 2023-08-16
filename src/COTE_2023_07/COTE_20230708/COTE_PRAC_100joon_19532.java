package COTE_2023_07.COTE_20230708;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class COTE_PRAC_100joon_19532 {
	public static void main(String[] args) throws IOException{
		System.out.println(4*2 + "x + " + 1);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String inputStr = br.readLine();
		
		int x = 0;
		int y = 0;
		
		int a = Integer.parseInt(inputStr.split(" ")[0]);
		int b = Integer.parseInt(inputStr.split(" ")[1]);
		int c = Integer.parseInt(inputStr.split(" ")[2]);
		int d = Integer.parseInt(inputStr.split(" ")[3]);
		int e = Integer.parseInt(inputStr.split(" ")[4]);
		int f = Integer.parseInt(inputStr.split(" ")[5]);
		
//		for(int i = -999; i < 1000; i++) {
//			for(int j = -999; j < 1000; j++) {
//				if ((a * i) + (b * j) == c && (d * i) + (e * j) == f) {
//					System.out.println(i + " " + j);
//				}
//			}
//		}
		
		
		
		// 지뢰찾기 
		
		// 초급
		/*
		 * 총 100칸 2차 배열
		 * 랜덤 지뢰 25
		 * 주변 8칸 숫자 부여
		 * 
		 * 200개 배열
		 */
		
		int[][] bombs = new int[10][10];
		
		// 랜덤 [x,y] 25개 안겹치게 하여 x, y 에는 -1 입력
		
		
		// 0, 0 부터 -1이
		// 주변에 보이면 +1 해준다 주변에 지뢰 갯수
		
		// 랜덤으로 주는거 부터
		int ran = (int) (Math.random() * 5);
		
		
		
	}
	
}
