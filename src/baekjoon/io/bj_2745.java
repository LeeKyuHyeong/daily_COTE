package baekjoon.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class bj_2745 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = br.readLine();
		
		String number = input.split(" ")[0];
		int len = number.length();
		
		int arith = Integer.parseInt(input.split(" ")[1]);
		
		int answer = 0;
		
		String numReg = "^[0-9]*$";
		
		//int arith = 36;
		if(arith > 10) {
			
			Map<Character, Integer> map = new HashMap<>(); 
			
			for(int i = 10; i < arith; i++) {
				map.put((char)(55+i) , i);
			}
			
			for(int j = 0; j < len; j++) {
				
				if(number.split("")[len-j-1].matches(numReg)) {
					answer += Integer.parseInt(number.split("")[len-j-1]) * Math.pow(arith, j);
				} else {
					answer += map.get(number.charAt(len-j-1)) * Math.pow(arith, j);
				}
				
				System.out.print(answer + "\t");
			}
			
		} else {
			for(int j = 0; j < len; j++) {
				answer += Integer.parseInt(number.split("")[len-j-1]) * Math.pow(arith, j);
				System.out.print(answer + "\t");
			}
			
		}
		
		System.out.println(answer);
		
	}
	
}
