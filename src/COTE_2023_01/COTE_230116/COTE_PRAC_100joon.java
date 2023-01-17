package COTE_2023_01.COTE_230113;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class COTE_PRAC_100joon {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        // while문 돌릴 변수 입력
        int length = Integer.parseInt(br.readLine());
        int tmp = 0;
        int arr[][] = new int[length][2];
        while(length > tmp) {
            
            String inputStr = br.readLine();
            
            arr[tmp][0] = Integer.parseInt(inputStr.split(" ")[0]);
            arr[tmp][1] = Integer.parseInt(inputStr.split(" ")[1]);
            
            tmp++;
        }
        
        Arrays.sort(arr, new Comparator<int[]>() {
			
			public int compare(int[] arr1, int[] arr2) {
				return arr1[0]!=arr2[0] ? arr1[0]-arr2[0] : arr1[1]-arr2[1];
			}
			
		});
        
        for(int i = 0; i < length; i++) {
            bw.write(arr[i][0] + " " + arr[i][1] + "\n");
        }
        
        bw.flush();
        bw.close();
	}
}
