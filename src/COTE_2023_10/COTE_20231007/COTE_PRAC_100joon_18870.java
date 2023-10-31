package COTE_2023_10.COTE_20231007;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class COTE_PRAC_100joon_18870 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cycle = Integer.parseInt(br.readLine());
		
		int intArr[] = new int[cycle];
		
		String inputStr = br.readLine();
		
		String originArr[] = inputStr.split(" ");
		
		for(int i = 0; i < intArr.length; i++) {
			
			intArr[i] = Integer.parseInt(inputStr.split(" ")[i]);
		}
		
		int tmp = 0;
		Arrays.sort(intArr);
		
		Map<Integer, Integer> map = new HashMap<>();
		
		map.put(intArr[0], tmp);
		
		for(int j = 1; j < intArr.length; j++) {
			
			if(intArr[j] != (intArr[j-1])) {
				tmp++;
			}
			map.put(intArr[j], tmp);
		}
		
		for(int k = 0; k < originArr.length; k++) {
			System.out.print(map.get(Integer.parseInt(originArr[k])) + " ");
		}
	
		br.close();
	}
}
