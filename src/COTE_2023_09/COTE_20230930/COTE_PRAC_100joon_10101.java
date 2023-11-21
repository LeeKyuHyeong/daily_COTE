package COTE_2023_09.COTE_20230930;

import java.util.Scanner;

public class COTE_PRAC_100joon_10101 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		String answer = (a == b && b == c && c == 60) ? "Equilateral" : ( (a + b + c) == 180 && (a == b || b == c || c == a) ) ? "Isosceles" :  (a + b + c) == 180 ? "Scalene" : "Error";
		
		System.out.println(answer);
		
	}
}
