package COTE_2023_10.COTE_20231006;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class COTE_PRAC_100joon_10814 {
	
	public static void main(String[] args) throws IOException{
				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cycle = Integer.parseInt(br.readLine());
		
		String strArr[][] = new String[cycle][2];
		
		for(int i = 0; i < cycle; i++) {
			
			String input = br.readLine();
			
			strArr[i][0] = input.split(" ")[0];
			strArr[i][1] = input.split(" ")[1];
			
		}
		
		br.close();
		
		Arrays.sort(strArr, new Comparator<String[]>() {

			@Override
			public int compare(String[] o1, String[] o2) {
				return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
			}
			
		});
		
		for(int i = 0; i < cycle; i++) {
			bw.write(strArr[i][0] + " " + strArr[i][1] + "\n");
		}
		
		bw.flush();
		bw.close();
		
	}

}
