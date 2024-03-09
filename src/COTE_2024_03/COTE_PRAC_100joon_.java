package COTE_2024_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class COTE_PRAC_100joon_ {

	public static int[][] arr;
	
	public static void  main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		
		arr = new int[size+1][2];
		
		arr[0][0] = 1;
		arr[0][1] = 0;
		arr[1][0] = 0;
		arr[1][1] = 1;
		
		find(size);
		
		System.out.println(Arrays.deepToString(arr));
		
	}
	
	public static void find(int n) {
		System.out.println("n : " + n);
				
		if(n == 0 || n == 1) {
			return;
		} 
		
		for(int i = 2; i <= n; i++) {
			arr[n][0] = arr[n-1][0] + arr[n-2][0];
			arr[n][1] = arr[n-1][1] + arr[n-2][1];
		}
		
	}
}
