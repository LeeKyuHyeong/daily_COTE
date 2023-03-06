package COTE_2023_03.COTE_230304;

import java.util.Arrays;
import java.util.Comparator;

public class COTE_PRAC_pgs4 {

	public static void main(String[] args) {

		int[][] lines = {
				{0, 5},
				{3, 9},
				{1, 10}
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
		int sum = 0;
		System.out.println(Arrays.deepToString(lines));
		if(lines[0][1] <= lines[1][0] && lines[1][1] <= lines[2][0]) {
			//세 선분이 연결도 안됐을때 또는 끄트머리에 연결만 돼있을때
			System.out.println("겹치는게 없을 때 answer 0 바로 반환");
			answer = 0;
		} else if(lines[0][1] < lines[1][0]){
			//처음과 두번째가 연결 안될 시
			System.out.println("1 ~ 2 겹치지않을때 ");
			total = MAXline - lines[1][0];
			System.out.println("total : " + total);
			for(int i = 1; i < lines.length; i++) {
				sum += (lines[i][1] - lines[i][0]);
				System.out.println(i + ", sum : " + sum);
			}
			//total = lines[1][1] > lines[2][1] ? lines[1][1] - lines[2][1] : (lines[1][1] - lines[2][1]) * -1;
			
		} else if(lines[1][1] < lines[2][0]) {
			//두번째와 세번째가 연결 안될 시
			System.out.println("2 ~ 3 겹치지않을때 ");
			
			total = lines[1][1] > lines[0][1] ? lines[1][1] - lines[0][0] : lines[0][1] - lines[0][0];
			System.out.println("total : " + total);
			
			for(int i = 0; i < lines.length - 1; i++) {
				sum += (lines[i][1] - lines[i][0]);
				System.out.println(i + ", sum : " + sum);
			}
			
			//total = lines[0][1] > lines[1][1] ? lines[0][1] - lines[1][1] : (lines[0][1] - lines[1][1]) * -1;
		}
		else {
			System.out.println("일단 셋다 겹치긴 할 때");
			total = MAXline - lines[0][0];
			System.out.println("total : " + total);
			for(int i = 0; i < lines.length; i++) {
				sum += (lines[i][1] - lines[i][0]);
				System.out.println(i + ", sum : " + sum);
			}
			
		}
		
		answer = sum - total;
		
		System.out.println(answer);
		
	}

}
