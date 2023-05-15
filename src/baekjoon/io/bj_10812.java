package baekjoon.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class bj_10812 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = br.readLine();
		
		int size = Integer.parseInt(input.split(" ")[0]);
		int loop = Integer.parseInt(input.split(" ")[1]);
		
		int[] intArr = new int[size];
		
		int[] beforeArr = new int[intArr.length];
		
		for(int i = 0; i < size; i++) {
			intArr[i] = i+1;
			beforeArr[i] = i+1;
		}
		
		int tmp = 0;
		
		while(tmp < loop) {
			
			String whileInput = br.readLine();
			
			int begin = Integer.parseInt(whileInput.split(" ")[0]) - 1;
			int end = Integer.parseInt(whileInput.split(" ")[1]) - 1;
			int mid = Integer.parseInt(whileInput.split(" ")[2]) - 1;
			
			//int whileTmp = 0;
			
			if(begin == mid) {
				//begin 과 mid가 같으면 변경이 없다
			} else {
//				System.out.println("begin : " + begin + ", end : " + end + ", mid : " + mid);
				
				
				for(int i = 0, j = begin; i <= end-begin; i++) {
					System.out.println("i 반복 : " + i + "\t j : " + j);
					if(mid+i <= end) {
						System.out.println("mid+i : " + (i + mid));
						
						beforeArr[i+begin] = intArr[mid+i];
					} else {
						System.out.println("mid+i : " + (i + mid));
						
						beforeArr[i+begin] = intArr[j];
						j++;
					}
					
//					System.out.println("intArr = " + Arrays.toString(intArr));
//					System.out.println("beforeArr = " + Arrays.toString(beforeArr));
					
					
				}
				for(int j = 0; j < beforeArr.length; j++) {
					intArr[j] = beforeArr[j];
				}
			}
			
			tmp++;
		}
//		System.out.println("intArr = " + Arrays.toString(intArr));
//		System.out.println("beforeArr = " + Arrays.toString(beforeArr));
		
		br.close();
		
		for(int i : intArr) {
			bw.write(String.valueOf(i) + " ");
		}
		
		bw.flush();
		bw.close();
		
		
	}
}
