package COTE_2023_10.COTE_20231001;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class COTE_PRAC_100joon_5073 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean flag = true;
		
		int cnt = 1;
		
		Map<Integer, String> map = new HashMap<>();
		
		while(flag) {
			String input = br.readLine();
			
			if(input.equals("0 0 0")) {
				flag = false;
				break;
			}
			
			int a = Integer.parseInt(input.split(" ")[0]);
			int b = Integer.parseInt(input.split(" ")[1]);
			int c = Integer.parseInt(input.split(" ")[2]);
			
			int MAX = Math.max(Math.max(a, b), c);
			
			//map.put(cnt, (a == b && b == c) ? "Equilateral" : (a == b || b == c || c == a) ? "Isosceles" : ( (a+b+c) - MAX > MAX ) ? "Scalene" : "Invalid");
			map.put(cnt, (a == b && b == c) ? "Equilateral" : ( (a+b+c) - MAX <= MAX ) ? "Invalid" : (a == b || b == c || c == a) ? "Isosceles" : "Scalene");
			
			cnt++;
		}
		
		br.close();
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i = 1; i < cnt; i++) {
			bw.write(map.get(i) + "\n");
		}
		bw.flush();
		bw.close();
		
	}
}
