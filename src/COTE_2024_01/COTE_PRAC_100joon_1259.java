package COTE_2024_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class COTE_PRAC_100joon_1259 {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean flag = true;
		
		while(flag) {
			String input = br.readLine();
			
			if(input.equals("0")) {
				flag = false;
			} else {
				System.out.println(palindrom(input));    
			}
		}
	}
	public static String palindrom(String n) {
		String result = "no";
		
		int mid = n.length() / 2;
		if(n.length() == 1) {
			result = "yes";
		} else {        
			if(n.length() % 2 == 0) {
				// 길이가 짝수일때
				if(mid == 1) {
					// 두자리
					if(n.split("")[0].equals(n.split("")[1])) {
						result = "yes";
					}
				} else {
					// 네자리
					if(n.split("")[0].equals(n.split("")[3]) && n.split("")[1].equals(n.split("")[2])) {
						result = "yes";
					}
				}
			} else {
				// 길이가 홀수일때
				if(mid == 1) {
					// 세자리
					if(n.split("")[0].equals(n.split("")[2])) {
						result = "yes";
					}
				} else {
					// 다섯자리
					if(n.split("")[0].equals(n.split("")[4]) && n.split("")[1].equals(n.split("")[3])) {
						result = "yes";
					}
				}
				
				
			}
		}
		return result;
		
	}
	

}
