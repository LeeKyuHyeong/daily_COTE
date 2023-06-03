package COTE_2023_03.COTE_230308;

import java.util.Arrays;

public class COTE_PRAC_pgs2 {

	public static void main(String[] args) {
		
		//String s = "try hello world";
		String s = " abc   cde  defgh  ";
		StringBuilder sb = new StringBuilder();
		//String s = "";
		String answer = "";
		
		String[] strArr = s.split(" ");
        
		System.out.println(Arrays.toString(strArr));
		
        for(int i = 0; i < strArr.length; i++) {
        	sb.delete(0, sb.length());
            for(int j = 0; j < strArr[i].length(); j++) {
            	
	            if(j % 2 == 0) {
	            	sb.append(strArr[i].split("")[j].toUpperCase());
	            } else {
	            	sb.append(strArr[i].split("")[j].toLowerCase());
	            }
        	}
            strArr[i] = sb.toString();
        }
        
        answer = String.join(" ", strArr);
        
        System.out.println(answer);
	}
	
}
