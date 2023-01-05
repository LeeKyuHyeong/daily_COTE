package COTE_2023_01.COTE_230104;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class COTE_PRAC_100joon {
	
	public static int[] x;
    public static int[] y;
    public static int[] tmpX;
    public static int[] tmpY;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        
        int numSize = Integer.parseInt(input);
        
        int tmp = 0;
        String[] strArr = new String[numSize];
        
        Map<String, Integer> map = new HashMap<>();
        
        while(tmp < numSize) {
        	strArr[tmp] = br.readLine();
        	map.put(strArr[tmp], strArr[tmp].length());
        	tmp++;
        }
        
        System.out.println(map.get(strArr[0]));
        
        bw.write(Arrays.deepToString(strArr));
        
        bw.flush();
        bw.close();

    
    }

}
