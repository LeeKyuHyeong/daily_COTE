package COTE_2023_02.COTE_230201;

import java.util.HashMap;
import java.util.Map;

public class COTE_PRAC_100joon {
	
	public static void main(String[] args) {
		
		int N = 20;
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i = 1; i <= N; i++) {
			int tmp = N / i;
			if(i * tmp == N) {
				map.put(i, tmp);
			}
		}
		
		for(int result : map.keySet()) {
			System.out.println(result + ", " + map.get(result));
		}
		
	}
	
}
