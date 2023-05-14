package baekjoon.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj_9086 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cnt = Integer.parseInt(br.readLine());
		
		int tmp = 0;
		
		StringBuilder sb = new StringBuilder();
		
		while(tmp < cnt) {
			String input = br.readLine();
			
			sb.append(input.charAt(0));
			
			if(input.length() == 1) {
				sb.append(input);
			} else {
				sb.append(input.charAt(input.length()-1));
			}
			sb.append("\n");
			tmp++;
		}
		
		br.close();
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

}
