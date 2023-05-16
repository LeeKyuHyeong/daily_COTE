package baekjoon.io;

import java.util.Scanner;

public class bj_10988 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		int loop = input.length() / 2;
		
		char[] charArr = input.toCharArray();
		
		char tmpChar = ' ';
		
		for(int i = 0; i < loop; i++) {
			tmpChar = charArr[i];
			charArr[i] = charArr[input.length() - i - 1];
			charArr[input.length() - i - 1] = tmpChar;
		}
		
		String newStr = new String(charArr);
		
		if(input.equals(newStr)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
		
	}
}
