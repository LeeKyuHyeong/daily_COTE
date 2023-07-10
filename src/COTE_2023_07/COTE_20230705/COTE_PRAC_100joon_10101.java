package COTE_2023_07.COTE_20230705;

import java.util.Scanner;

public class COTE_PRAC_100joon_10101 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		String answer = "";
		
		
		if(x + y + z != 180) {
			answer = "Error";
		} else  {
			if (x == y || y == z || x == z) {
				if(x == y && y == z) {
					answer = "Equilateral";
				} else {
					answer = "Isosceles";
				}
			} else {
				answer = "Scalene";
			}
		} 
		
		System.out.println(answer);
		
		
	}
}
