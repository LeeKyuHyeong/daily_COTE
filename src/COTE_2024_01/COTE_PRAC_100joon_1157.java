package COTE_2024_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class COTE_PRAC_100joon_1157 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String inputStr = br.readLine().toUpperCase();
        
        Map<Character, Integer> map = new HashMap<>();
        
        char[] chArr = inputStr.toCharArray();
        
        System.out.println(Arrays.toString(chArr));
        
        int MAX = 0;
        int dup = 0;
        
        for(int i = 0; i < chArr.length; i++) {
            map.put(chArr[i], (map.getOrDefault(chArr[i], 0) + 1));
            System.out.println(i +"번째 " +map + ", " + map.get(chArr[i]));
            if(map.get(chArr[i]) > MAX) {
                MAX = map.get(chArr[i]);
                dup = 0;
            } else if (map.get(chArr[i]) == MAX) {
                dup = 1;
            }
        }
        
        System.out.println(map);
        
        br.close();
        
        char answer = ' ';
        
        if(dup == 1) {
            answer = '?';
        } else {
            for(char ch : map.keySet()) {
                if(map.get(ch) == MAX) 
                    answer = ch;
            }
        }
                
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
		
	}
}
