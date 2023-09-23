package COTE_2023_08.COTE_20230829;

import java.util.Scanner;

public class COTE_PRAC_100joon_1436 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int score = 0;
		
		int answer = 0;
		
		System.out.println(String.valueOf(666).indexOf("666"));
		
		for(int i = 666; i < 1000000; i++) {
			if(String.valueOf(i).indexOf("666") > -1) {
				score++;
				if(score == num) {
					answer = i;
					break;
				}
			}
		}
		
		//System.out.println(answer);
		
		sc.close();
		
	}
}
