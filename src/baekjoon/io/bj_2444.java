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
				System.out.println("i :" + i + "\t");
				for(int j = 0; j < line; j++) {
					System.out.print("j :" + j+ "\t");
				}
				for(int k = 0; k < line; k++) {
					System.out.print("k :" + k + "\t");
				}
			}
			
			System.out.println();
		}
		
	}
	
}
