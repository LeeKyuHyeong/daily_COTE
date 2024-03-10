package COTE_2024_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class COTE_PRAC_100joon_ {

	public static int[] arr;
	public static int[][] answer;
	public static int MAX = 2;
	
	public static void  main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		
		arr = new int[size];
		
		for(int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			MAX = MAX > arr[i] ? MAX : arr[i];
		}
		
		answer = new int[MAX+1][2];
		
		answer[0][0] = 1;
		answer[0][1] = 0;
		
		answer[1][0] = 0;
		answer[1][1] = 1;
		
		find(MAX);
		
		//System.out.println(Arrays.deepToString(answer));
		
		for(int j = 0; j < size; j++) {
			System.out.println(answer[arr[j]][0] + " " + answer[arr[j]][1]);
		}
		
	}
	
	public static void find(int n) {
		System.out.println("n : " + n);
				
		if(n == 0 || n == 1) {
			return;
		} 
		
		for(int i = 2; i <= n; i++) {
			answer[i][0] = answer[i-1][0] + answer[i-2][0];
			answer[i][1] = answer[i-1][1] + answer[i-2][1];
		}
		
	}
}
