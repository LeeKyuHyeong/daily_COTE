package COTE_2023_03.COTE_230302;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class COTE_PRAC_pgs5 {
	public static void main(String[] args) {
		
		String polynomial = "x + x + x";
		StringBuilder sb = new StringBuilder();
		
		String regInt = "^[0-9]*$";
		
		List<String> strList = new ArrayList<>();
		
		for(String s : polynomial.split("")) {
			if(s.equals("+")) {
				strList.add(sb.toString().trim());
				sb.delete(0, sb.length());
			} else {
				sb.append(s);
			}
		}
		if(!sb.toString().equals("")) {
			strList.add(sb.toString().trim());
		}
		
		int sum = 0;
		int xSum = 0;
		
		for(int i = 0; i < strList.size(); i++) {
			if(Pattern.matches(regInt, strList.get(i))) {
				sum += Integer.parseInt(strList.get(i));
			} else {
				if(strList.get(i).equals("x")) {
					xSum += 1;
				} else {
					xSum += Integer.parseInt(strList.get(i).split("")[0]);
				}
			}
		}
		String answer = "";
		
		if(xSum == 0) {
			answer = String.valueOf(sum);
		} else {
			if(sum == 0) {
				answer = xSum + "x";
			} else {
				answer = xSum + "x + " + sum;
			}
		}
		
		System.out.println(answer);
		
	}
}
