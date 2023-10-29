package COTE_2023_10.COTE_20231006;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class COTE_PRAC_100joon_10814 {
	
	public static void main(String[] args) throws IOException{
				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cycle = Integer.parseInt(br.readLine());
		
		List<Map<Integer, String>> list = new ArrayList<Map<Integer, String>>();
		
		Map<Integer, String> param = new HashMap<>();
		
		for(int i = 0; i < cycle; i++) {
			
			String input = br.readLine();
			
			param.put(Integer.parseInt(input.split(" ")[0]), input.split(" ")[1]);
			
			list.add(param);
		}
		
		list.sort(new Comparator<String>(String str1, String str2) {
			return str1 - str2;
		});
		
	}

}
