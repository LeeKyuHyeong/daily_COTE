package COTE_2023_05.COTE_230519;

import java.util.Scanner;

public class COTE_PRAC_bj_2231 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        int answer = 0;
        
        for(int i = 1; i < num; i++) {
            if(num == findMinConst(i)) {
                answer = i;
                break;
            }
        }
        
        System.out.println(answer);
        
    }
    static int findMinConst(int n) {
        int result = 0;
        
        int sum = 0;
        
        if(n < 10) {
            result = n * 2;
        } else {
            String numStr = String.valueOf(n);
            
            for(int i = 0; i < numStr.length(); i++) {
                sum += Integer.parseInt(numStr.split("")[i]);
            }
            result = n + sum;
        }
        
        return result;
    }
	
}
