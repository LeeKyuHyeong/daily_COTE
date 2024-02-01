package COTE_2024_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class COTE_PRAC_100joon_1546 {
	static int MAX = 1;
	
	static int[] intArr;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int size = Integer.parseInt(br.readLine());
		
		intArr = new int[size];
		
		String scores = br.readLine();
		
		for(int i = 0; i < size; i++) {
			int tmp = Integer.parseInt(scores.split(" ")[i]);
			intArr[i] = tmp;
			if(tmp > MAX)
				MAX = tmp;
		}
		
		double sum = 0;
		
		for(int j = 0; j < size; j++) {
			System.out.println(intArr[j]);
			intArr[j] = (intArr[j] * 100) / MAX; 
			System.out.println(intArr[j]);
			sum += intArr[j];
		}

		System.out.println( sum / size );
	}
}
