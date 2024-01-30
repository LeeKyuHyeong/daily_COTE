package COTE_2024_01;

import java.util.Scanner;

public class COTE_PRAC_100joon_1436 {
	
	static int[] intArr;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		
		intArr = new int[size];
		
		intArr[0] = 666;
		
		int tmp = 1;
		
		int num = 1666;
		
		while(tmp < size) {
			
			if(String.valueOf(num).indexOf("666") > -1) {
				intArr[tmp] = num;
				
				tmp++;
			}
			num++;
			
		}
		
		System.out.println(intArr[size-1]);
		
	}
	
}
