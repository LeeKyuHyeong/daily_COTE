package COTE_2023_10.COTE_20231002;

import java.util.Scanner;

public class COTE_PRAC_100joon_14215 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		int a = Integer.parseInt(input.split(" ")[0]);
		int b = Integer.parseInt(input.split(" ")[1]);
		int c = Integer.parseInt(input.split(" ")[2]);
		
		int sum = a + b + c;
		
		int max = Math.max(Math.max(a, b), c);
		
		int answer = 0;
		
		if(max < sum - max) {
			answer = sum;
		} else {
			answer = 2 * (sum - max) - 1;
		}
		
		System.out.println(answer);
	}
}
