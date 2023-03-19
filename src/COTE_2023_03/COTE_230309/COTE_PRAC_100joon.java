package COTE_2023_03.COTE_230309;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class COTE_PRAC_100joon {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int num = Integer.parseInt(br.readLine());

    	br.close();
    	
        String str = "";
        for(int i = 0; i < (num / 4); i++) {
            str += "long ";
        }
        str += "int";

        bw.write(str);
        bw.flush();
        bw.close();
        
    }
}