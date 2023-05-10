package baekjoon.io;

import java.io.*;

public class bj_11718 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder sb = new StringBuilder();
		
		while(br.readLine() != null) {
			
			sb.append(br.readLine());
		}
		
		br.close();
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
