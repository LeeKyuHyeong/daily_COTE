package COTE_221229;

import java.util.Scanner;

public class COTE_PRAC_100joon {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] intArr = new int[10];
		
		/*
		 * for(int j = 0; j < intArr.length; j++) { intArr[j] = 0; }
		 */
		
		int i = 0;
		while(i < 8) {
			int inputNum = sc.nextInt();
			
			intArr[inputNum-1]++;
			i++;
		}
		int result = 1;
		
		for(int k : intArr) {
			if(k == 1) {
				
			} else {
				System.out.println(result);
			}
			result++;
		}
		
	}

}
