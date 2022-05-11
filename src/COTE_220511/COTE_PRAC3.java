package COTE_220511;

import java.util.Scanner;

public class COTE_PRAC3 {
	public static void main(String[] args) {
		//다이아몬드 만들기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력(홀수만) : ");
		int height = sc.nextInt();
		if(height < 0) {
			System.out.println("숫자 입력 오류");
			System.exit(0);
		}
		
		int half_height = height / 2;
		
		int standard = (2 * height) - 1;
		
		for(int i = 0; i < height; i++) {
			if(i <= half_height) {
				for(int j = half_height; j > i; j--) {
					System.out.print(" ");
				}
				for(int k = 0; k < (2 * i) + 1; k++) {
					System.out.print("*");					
				}
				System.out.println();
			} else {
				for(int j = 0; j < i-half_height; j++) {
					System.out.print(" ");
				}
				for(int k = 0; k < standard - (2 * i); k++) {
					System.out.print("*");					
				}
				System.out.println();				
			}
		}
		
	}
}
