package COTE_2023_03.COTE_230324;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class COTE_PRAC_100joon {

	// 10810 번  공 넣기
	//BufferedReader 와 writer 를 쓰기위한 예외처리
public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String answer = "";
        String input = br.readLine();
        
        int size = Integer.parseInt(input.split(" ")[0]);
        int loop = Integer.parseInt(input.split(" ")[1]);
        
        int[] baskets = new int[size];
        
        for(int i = 0; i < baskets.length; i++) {
            baskets[i] = i+1;
        }
        
        int tmp = 0;
        while(tmp < loop) {
            String whileInput = br.readLine();
            
            int first = Integer.parseInt(whileInput.split(" ")[0]);
            int last = Integer.parseInt(whileInput.split(" ")[1]);
            
            int whileTmp = 0;
            
            for(int i = first - 1; i < last - 1; i++) {
            	//System.out.println("i : " + i + "last - i - 1 : " + (last-i));
            	
            	boolean notInt = false;
            	
            	
            	whileTmp = baskets[i];
            	baskets[i] = baskets[last - i];
            	baskets[last - i] = whileTmp;
            }
            //System.out.println((tmp+1) + "번째 arr : "+Arrays.toString(baskets));
            tmp++;
        }
        br.close();
        for(int i : baskets) {
            answer += i + " ";
        }
        bw.write(answer);
        bw.flush();
        bw.close();
    }

}
