package COTE_2024_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class COTE_PRAC_100joon_2108 {
	
	public static int[] arr;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = Integer.parseInt(br.readLine());
		
		arr = new int[cnt];
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println(sum / arr.length);
		
		System.out.println(arr[arr.length / 2]);
		
		System.out.println(arr[arr.length - 1] - arr[0]);
		
		
	}
}
