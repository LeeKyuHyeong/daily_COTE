package baekjoon.io;

import java.util.Scanner;

public class bj_2444 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int line = sc.nextInt();
		
		for(int i = 0; i < 2*line - 1; i++) {
			if(i < line) {
				for(int j = line-1; j > i; j--) {
					System.out.print(" ");
				}
				for(int k = 0; k < 2*i +1; k++) {
					System.out.print("*");
				}
			} else {
				// 0~6  0~4  0~2  0~0
				for(int k = 0; k <= i - line; k++) {
					System.out.print(" ");
				}
				// 0~0  0~1  0~2  0~3
				for(int j = 0; j <= ((line-1) * 4) - (2 * i); j++) {
					//System.out.print("j : " + j + "\t");
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
		
	}
	
}
