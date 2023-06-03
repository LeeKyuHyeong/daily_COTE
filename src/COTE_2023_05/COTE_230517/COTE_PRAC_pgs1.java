package COTE_2023_05.COTE_230517;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class COTE_PRAC_pgs1 {

	public static void main(String[] args) {
		
		String[] name = {"may", "kein", "kain", "radi"};
		
		int[] yearning = {5, 10, 1, 3};
		
		String[][] photo = {
				{"may", "kein", "kain", "radi"},
				{"may", "kein", "brin", "deny"},
				{"kon", "kain", "may", "coni"}
		};
		
		int[] answer = new int[photo.length];
		
		Map<String, Integer> map = new HashMap<>();
		
		for(int i = 0; i < name.length; i++) {
			map.put(name[i], yearning[i]);
		}
		
		for(int i = 0; i < photo.length; i++) {
			for(int j = 0; j < photo[i].length; j++) {
				answer[i] += map.getOrDefault((photo[i][j]), 0);
			}
		}
		
		System.out.println(Arrays.toString(answer));
	}
	
}
