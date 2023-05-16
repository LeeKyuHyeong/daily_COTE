package baekjoon.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class bj_10798 {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int tmp = 0;
		
		String[] strArr = new String[5];
		
		Map<String, Integer> map = new HashMap<>();
		
		while(tmp < 5) {
			
			String input = br.readLine();
			
			int len = input.length();
			
			strArr[tmp] = input;
			
			map.put(input, input.length());
			
			tmp++;
		}
		
		for(String s : map.keySet()) {
			System.out.println("keySet : " + s + ", get(s) : " + map.get(s));
		}
		
	}

}
