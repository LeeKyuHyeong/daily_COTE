package COTE_2024_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class COTE_PRAC_100joon_2562 {

	static int MIN = 2500;
	
	public static void main(String[] args) throws IOException{
		
		
		System.out.println("         ,r7");
        System.out.println("r-_    ,  ,/");
        System.out.println(" \\. \". L_r\'");
        System.out.println("   `~/");
        System.out.println("      |");
        System.out.println("      |");
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        boolean flag = true;
        
        while(flag) {
        	String input = br.readLine();
        	
        	if("0 0".equals(input)) {
//        		flag = false;
        		System.exit(0);
        	}
        	System.out.println(input);
        }
        
        
        
        
        
        
        
        
        
        
        
        int MAX = -1;
        int maxIdx = 0;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        for(int i = 0; i < 9; i++) {
            String strInput = br.readLine();
            int input = Integer.parseInt(strInput);
            if(input > MAX){
                MAX = input;
                maxIdx = i;
            }            
        }
        
        br.close();
        
        String str = "ab";
        
        String ch = str.split("")[0];
        
        bw.write(String.valueOf(MAX) + "\n" + String.valueOf(maxIdx));
        bw.flush();
        bw.close();
        
	}
}
