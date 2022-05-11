package COTE_220511;

import java.util.Scanner;

public class COTE_PRAC2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int height = sc.nextInt();
		if(height < 0) {
			System.out.println("숫자 입력 오류");
			System.exit(0);
		}
		
		for(int i = 0; i < height; i++) {
			for(int j = height-1; j > i; j--) {
				System.out.print(" ");
			}
			for(int k = 0; k < (2*i) + 1; k++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		
	}
}
