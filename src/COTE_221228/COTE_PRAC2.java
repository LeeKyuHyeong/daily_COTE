package COTE_221228;

import java.util.Scanner;

public class COTE_PRAC2 {

	public static void main(String[] args) {

		int answer = 0;
		
		Scanner sc = new Scanner(System.in);
		
		int numLength = sc.nextInt();
		sc.nextLine();
		String[] strArr = new String[numLength];
		
		String numbers = sc.nextLine();

		strArr = numbers.split(" ");
		
		String inputStr = sc.nextLine();
		
		for(String s : strArr) {
			if(s.equals(inputStr)) {
				answer++;
			}
		}
		System.out.println(answer);
		
	}

}
