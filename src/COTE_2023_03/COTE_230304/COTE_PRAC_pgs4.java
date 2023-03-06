package COTE_2023_03.COTE_230304;

import java.util.Arrays;
import java.util.Comparator;

public class COTE_PRAC_pgs4 {

	public static void main(String[] args) {

		int[][] lines = {
				{0, 2},
				{3, 5},
				{-1, 5}
		};
		
		int answer = -1;
		int[][] MAXlines = Arrays.copyOf(lines, lines.length);
		
		Arrays.sort(MAXlines, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				return a[1] != b[1] ? a[1] - b[1] : a[0] - b[0];
			}
		});
		System.out.println(Arrays.deepToString(MAXlines));
		int MAXline = MAXlines[2][1];
		
		Arrays.sort(lines, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				return a[0] != b[0] ? a[0] - b[0] : a[1] - b[1];
			}
		});
		int total = 0;
		System.out.println(Arrays.deepToString(lines));
		if(lines[0][1] < lines[1][0] && lines[1][1] < lines[2][0]) {
			//세 선분이 연결도 안됐을때 또는 끄트머리에 연결만 돼있을때
			answer = 0;
		} else if(lines[0][1] < lines[1][0]){
			//처음과 두번째가 연결 안될 시
			
			total = lines[1][1] > lines[2][1] ? lines[1][1] - lines[2][1] : (lines[1][1] - lines[2][1]) * -1;
			System.out.println("total : " + total);
			
		} else if(lines[1][1] < lines[2][0]) {
			//두번째와 세번째가 연결 안될 시
			
			total = lines[0][1] > lines[1][1] ? lines[0][1] - lines[1][1] : (lines[0][1] - lines[1][1]) * -1;
			System.out.println("total : " + total);
		}
		else {
			
			int sum = 0;
			total = lines[2][1] - lines[0][0] + 1;
			System.out.println("total : " + total);
			for(int i = 0; i < lines.length; i++) {
				
				if(i < 2) {
					if(lines[i][1] < lines[i+1][0]) {
						sum = 0;
					} else {
						sum += (lines[i][1] - lines[i][0]);
					}
				} else {
					sum += (lines[i][1] - lines[i][0]);
				}
				System.out.println("sum : " + sum);
			}
			if(total > sum) {
				answer = 0;
			} else {
				answer = sum - total + 1;
			}
		}
		
		
		System.out.println(answer);
		
	}

}
