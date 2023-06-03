package COTE_2023_05.COTE_230518;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class COTE_PRAC_bj_2798 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String input = br.readLine();
        
        int card = Integer.parseInt(input.split(" ")[0]);
        int num = Integer.parseInt(input.split(" ")[1]);
        
        int[] cards = new int[card];
        
        String cardStr = br.readLine();
        
        for(int i = 0; i < card; i++) {
            cards[i] = Integer.parseInt(cardStr.split(" ")[i]);
        }
        
        int MAX = 0;
        int sum = 0;
        
        for(int i = 0; i < card - 2; i++) {

            for(int j = i + 1; j < card - 1; j++) {

                for(int k = j + 1; k < card; k++) {
                    sum = cards[i] + cards[j] + cards[k];
                    if( (sum <= num) && (sum > MAX)) {
                        MAX = sum;
                    }
                }
            }
        }
        
        System.out.println(MAX);
        
        br.close();
		
	}

}
