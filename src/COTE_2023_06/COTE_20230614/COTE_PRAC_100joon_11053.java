package COTE_2023_06.COTE_20230614;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class COTE_PRAC_100joon_11053 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		
		String num = br.readLine();
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(num.split(" ")[i]);
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		List<Integer> list = new ArrayList<>();
		list.add(arr[0]);
		
		for(int i = 0; i < n-1; i++) {
			if(arr[i] < arr[i+1]) {
				list.add(arr[i+1]);
			}
		}
		System.out.println(list.size());
	}
	
}
