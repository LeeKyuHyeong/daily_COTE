package baekjoon.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj_10798 {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int tmp = 0;
		
		StringBuilder sb = new StringBuilder();
		
		String[][] strArr = new String[5][15];
		
		for(int i = 0; i < strArr.length; i++) {
			for(int j = 0; j < strArr[i].length; j++) {
				strArr[i][j] = "";
			}
		}
		
		
		while(tmp < 5) {
			
			String input = br.readLine();
			
			int len = input.length();
			
			for(int i = 0; i < len; i++) {
				strArr[tmp][i] = input.split("")[i];
			}
			
			tmp++;
		}
		
		br.close();
		
		for(int i = 0; i < 15; i++) {
			for(int j = 0; j < 5; j++) {
				if( strArr[j][i] == "" ) {
					
				} else {
					sb.append(strArr[j][i]);
				}
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		
	}

}
