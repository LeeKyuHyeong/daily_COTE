package COTE_2023_09.COTE_20230926;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class COTE_PRAC_100joon {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		int x = Integer.parseInt(input.split(" ")[0]);
		int y = Integer.parseInt(input.split(" ")[1]);
		int w = Integer.parseInt(input.split(" ")[2]);
		int h = Integer.parseInt(input.split(" ")[3]);
		
		int answer = Integer.min(x, Integer.min(y, Integer.min(w-x, h-y)));
		
		br.close();
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
	}

}
