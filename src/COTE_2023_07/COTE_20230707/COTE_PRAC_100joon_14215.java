package COTE_2023_07.COTE_20230707;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class COTE_PRAC_100joon_14215 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int[] intArr = new int[3];
		
		for(int i = 0; i < intArr.length; i++) {
			intArr[i] = Integer.parseInt(str.split(" ")[i]); 
		}
		
		Arrays.sort(intArr);

		int n0 = intArr[0]; 
		int n1 = intArr[1]; 
		int n2 = intArr[2]; 
		
		int answer = 0;
		
		// 작은 두개 합이 큰거보다 클 때(삼각형 될 때)
		if(n0 + n1 > n2) {
			answer = n0 + n1 + n2;
		}
		// 작은 두개 합이 큰거보다 작거나 같을 때(삼각형 불가)
		if(n0 + n1 <= n2) {
			answer = 2 * (n0 + n1) - 1;
		}
		
		System.out.println(answer);
		
		
	}
}
