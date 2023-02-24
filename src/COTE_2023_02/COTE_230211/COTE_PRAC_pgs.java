package COTE_2023_02.COTE_230211;

import java.util.HashMap;
import java.util.Map;

public class COTE_PRAC_pgs {

	public static void main(String[] args) {

		int[] array = {3, 10, 30};
		int n = 20;
		
		int MIN = 100;
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < array.length; i++) {
            map.put(array[i], array[i] > n ? array[i] - n : n - array[i]);
            if(map.get(array[i]) < MIN) {
            	MIN = map.get(array[i]);
            	answer = array[i];
            }
        }
        
        System.out.println(answer);
		
	}

}
