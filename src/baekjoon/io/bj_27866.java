package baekjoon.io;

import java.io.*;

public class bj_27866 {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String input = br.readLine();
        
        int num = Integer.parseInt(br.readLine());
        
        br.close();
        
        bw.write(input.charAt(num-1));
        bw.flush();
        bw.close();
        
    }
}