package COTE_2023_09.COTE_20230927;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class COTE_PRAC_100joon_3009 {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int answerX = 0;
		int answerY = 0;
		
		Map<Integer, Integer> mapX = new HashMap<>();
		Map<Integer, Integer> mapY = new HashMap<>();
		
		Set<Integer> setX = new HashSet<>();
		Set<Integer> setY = new HashSet<>();
		
		for(int i = 0; i < 3; i++) {
			String input = br.readLine();
			
			int x = Integer.parseInt(input.split(" ")[0]);
			int y = Integer.parseInt(input.split(" ")[1]);

			setX.add(x);
			setY.add(y);
			
			mapX.put(x, mapX.getOrDefault(x, 0) + 1);
			mapY.put(y, mapY.getOrDefault(y, 0) + 1);
			
		}
		
//		Iterator<Integer> iterX = setX.iterator();
//		
//		while(iterX.hasNext()) {
//			int tmpX = iterX.next();
//			
//			if(mapX.get(tmpX) % 2 != 0) {
//				answerX = tmpX;
//			}
//		}
//		
//		Iterator<Integer> iterY = setY.iterator();
//		
//		while(iterY.hasNext()) {
//			
//			int tmpY = iterY.next();
//			
//			if(mapY.get(tmpY) % 2 != 0) {
//				answerY = tmpY;
//			}
//		}
		
		for(int i = 2; i <= 1000; i++) {
			if(mapX.get(i) != null && mapX.get(i) % 2 != 0) {
				answerX = i;
			}
			
			if(mapY.get(i) != null && mapY.get(i) % 2 != 0) {
				answerY = i;
			}
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        bw.write(answerX + " " + answerY);
        bw.flush();
        bw.close();
		
		System.out.println("answerX : " + answerX + ", answerY : " + answerY);
		
	}
}
