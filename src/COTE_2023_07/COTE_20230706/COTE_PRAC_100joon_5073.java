package COTE_2023_07.COTE_20230706;

import java.io.*;

public class COTE_PRAC_100joon_5073 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean flag = true;
		
		String answer = "";
		
		while(flag) {
			
			String input = br.readLine();
			if(input.equals("0 0 0")) {
				System.out.println(input);
				flag = false;
				return;
			}
			System.out.println("not 0 0 0");
			
			int x = Integer.parseInt(input.split(" ")[0]);
			int y = Integer.parseInt(input.split(" ")[1]);
			int z = Integer.parseInt(input.split(" ")[2]);
			
			if(x == y && y == z) {
				answer = "Equilateral";
				return;
			} else if(x == y) {
				if(y > z) {
					
				} else {
					
				}
			}
		}
		
	}
}
