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
				flag = false;
				return;
			}
			
			int x = Integer.parseInt(input.split(" ")[0]);
			int y = Integer.parseInt(input.split(" ")[1]);
			int z = Integer.parseInt(input.split(" ")[2]);
			
			
			if(x == y && y == z) {
				answer = "Equilateral";
			} else if(x == y) {
				if(y > z) {
					answer = "Isosceles";
				} else if(x + y < z){
					answer = "Invalid";
				}
			} else if(y == z){
				if(y > x) {
					answer = "Isosceles";
				} else if(z + y < x){
					answer = "Invalid";
				}
			} else if(x == z) {
				if(z > y) {
					answer = "Isosceles";
				} else if(z + x < y){
					answer = "Invalid";
				}
			}
			else {
				if(x > y) {
					if(y > z) { // x y z
						if(x < y + z) {
							answer = "Scalene";
						} else {
							answer = "Invalid";
						}
					} else { // z y
						if(x > z) {
							// x > z > y
							if(x < y + z) {
								answer = "Scalene";
							} else {
								answer = "Invalid";
							}
						} else { // z x y
							if(z < y + x) {
								answer = "Scalene";
							} else {
								answer = "Invalid";
							}
						}
					}
				} else { // y > x
					if(x > z) {
						if(y < x + z) {
							answer = "Scalene";
						} else {
							answer = "Invalid";
						}
					} else { // z > x 
						if(y > z) {
							// y > z > x
							if(y < x + z) {
								answer = "Scalene";
							} else {
								answer = "Invalid";
							}
						} else { // z y x
							if(z < y + x) {
								answer = "Scalene";
							} else {
								answer = "Invalid";
							}
						}
					}
				}
			}
			System.out.println(answer);
		}
		
	}
}
