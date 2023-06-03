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
            // last 에서 first 뺀게 홀수면 2나누고 +1 짝수면 2나눈만큼 반복
            int whileLoop = last - first % 2 != 0 ? ((last-first) / 2) + 1 : (last - first) / 2;
            System.out.println(tmp + ", first : " + first + ", last : " + last + ", whileLoop : " + whileLoop);
            if(first == last) { // 입력된 두 수가 같을때
            	System.out.println("입력된 두 수가 같을때");
            } else if(last - first == 1) { // 입력한 수가 1차이날때
            	System.out.println("입력된 두 수의 차이가 1일때");
            	whileTmp = baskets[first-1];
            	baskets[first-1] = baskets[last-1];
            	baskets[last-1] = whileTmp;
            } else { // 나머지 모든 경우
            	System.out.println("나머지 모든 경우의 수");
            	
            	for(int i = first-1, j = last -1; i < first + whileLoop - 1; i++, j--) {
            		//System.out.println(i + " : " + baskets[i] + ", " + j + " : " + baskets[j]);
            		System.out.println(i + " : " + baskets[i] + ", j : " + j + ", " + baskets[j]);
            		
            		whileTmp = baskets[i];
            		baskets[i] = baskets[j];
            		baskets[j] = whileTmp;
            	}
            	
            	/*
            	 * 5개 중에 1~4 라고 치면
            	 * first 1 / last 4
            	 * 1 2 3 4 5  -> 4 3 2 1 5
            	 * whileLoop == 2
            	 * first-1 last-1
            	 * first-0 last-2
            	 * 
            	 * whileLoop-2 / whileLoop+1 
            	 * whileLoop-1 / whileLoop
            	 * 0 - 3
            	 * 1 - 2
            	 * 두번이고 서로바꾸면됨
            	 * 
            	 * 5개 중에 1~5 라고 치면
            	 * first 1 / last 5
            	 * 1 2 3 4 5 -> 5 4 3 2 1
            	 * 0 - 4
            	 * 1 - 3
            	 * 
            	 * 
            	 * 5개 중에 2~5 라고 치면
            	 * first 2 / last 5
            	 * 1 2 3 4 5 -> 1 5 4 3 2
            	 * 1 - 4
            	 * 2 - 3
            	 * 
            	 * 5개 중에 3~5 라고 치면
            	 * first 3 / last 5
            	 * 1 2 3 4 5 -> 1 2 5 4 3
            	 * 2 - 4
            	 * 
            	 * int whileLoop = last - first % 2 != 0 ? ((last-first) / 2) + 1 : (last - first) / 2;
            	 */
            	
            	
            	
            }
            System.out.println(Arrays.toString(baskets));
            tmp++;
        }
        
        br.close();
        for(int i : baskets) {
            if(baskets[baskets.length -1] == i) {
                answer += i;
            } else {
                answer += i + " ";    
            }
        }
        bw.write(answer);
        bw.flush();
        bw.close();
    }

}
