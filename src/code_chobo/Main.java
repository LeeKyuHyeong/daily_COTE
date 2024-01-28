package code_chobo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
    
    static boolean[][] baseArr;
    static int MIN = 64;
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String sizeStr = br.readLine();
        
        int x = Integer.parseInt(sizeStr.split(" ")[0]);
        int y = Integer.parseInt(sizeStr.split(" ")[1]);
        
        baseArr = new boolean[x][y];
        for(int i = 0; i < x; i++) {
        	String str = br.readLine();
            for(int j = 0; j < y; j++) {

            	if('B' == str.charAt(j)) {
            		baseArr[i][j] = true;
            	} else {
            		baseArr[i][j] = false;
            	}
            }
        }
        System.out.println(Arrays.deepToString(baseArr));
        
        for(int i = 0; i < x - 7; i++) {
            for(int j = 0; j < y - 7; j++) {
                find(i, j);
            }
        }
        
        
        System.out.println(MIN);
        
    }
    
    static void find(int x, int y) {
        
        int endX = x + 8;
        int endY = y + 8;
        int cnt = 0;
        
        boolean base = baseArr[x][y];
        
        for(int i = x; i < endX; i++) {
            for(int j = y; j < endY; j++) {
                
                if(baseArr[i][j] != base) {
                    cnt++;
                } 
                
                base = !base;
                
            }
            base = !base;
        }
        
        MIN = Math.min(MIN, Math.min(cnt, 64-cnt));
                
    }
}
