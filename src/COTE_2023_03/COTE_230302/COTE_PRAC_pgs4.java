package COTE_2023_03.COTE_230302;

import java.util.Arrays;

public class COTE_PRAC_pgs4 {
	public static void main(String[] args) {
		
		int n = 40;
		
		int[] _3x = new int[100];
		
		int i = 1;
		
		for(int j = 0; j < 100; j++) {
			
			while(!okNum(i)) {
				
				i++;
			}
			
			_3x[j] = i;
			i++;
		}
		
		System.out.println(Arrays.toString(_3x));
		System.out.println(_3x[n - 1]);
	}
	static boolean okNum(int n) {
		
		boolean flag = true;
		
		if(n % 3 == 0) {
			flag = false;
		}
		if(String.valueOf(n).indexOf("3") > -1) {
			flag = false;
		}
		if(n / 10 == 3) {
			flag = false;
		}
		
		return flag;
	}
}
