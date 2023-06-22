package COTE_2023_06.COTE_20230620;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class COTE_PRAC_100joon_5086 {

	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean flag = true;
		
		String input = "";
		
		int tmp = 0;
		
		Map<Integer, String> map = new HashMap<>();
		
		while(flag) {
			
			input = br.readLine();
			if(input.equals("0 0")) {
				flag = false;
				break;
			}
			
			int n1 = Integer.parseInt(input.split(" ")[0]);
			int n2 = Integer.parseInt(input.split(" ")[1]);
			
			map.put(tmp, n2 % n1 == 0 ? "factor" : n1 % n2 == 0 ? "multiple" : "neither");
			
			tmp++;
		}
		
		for(int i : map.keySet()) {
			System.out.println(map.get(i));
		}
		
	}
	
}
