package COTE_2024_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class COTE_PRAC_100joon_1978 {
	
	public static boolean[] sosu = new boolean[1000];
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = Integer.parseInt(br.readLine());
		
		String nums = br.readLine();
		
		find();
		
		int result = 0;
		
		for(int i = 0; i < nums.split(" ").length; i++) {
			if(!sosu[Integer.parseInt(nums.split(" ")[i])])
				result++;
		}
		
		System.out.println(result);
		
	}
	public static void find() {
		sosu[0] = sosu[1] = true;
		
		for(int i = 2; i < Math.sqrt(1000); i++) {
			if(sosu[i]) {
				continue;
			}
			for(int j = i * i; j < sosu.length; j = j + i) {
				sosu[j] = true;
			}
		}
	}
}
