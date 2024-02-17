package code_chobo;

import java.util.Arrays;

public class TEST {
	public static void main(String[] args) {
		
		int[] arr = new int[100];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100) + 1;
		}
				
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		
	}
	public static boolean find(int x) {
		
		boolean OX = false;
		
		if(x == 1 || x ==2) {
			OX = true;
		}
		
		for(int i = 2; i < Math.sqrt(x); i++) {
			
		}
		
		return OX;
	}
}
