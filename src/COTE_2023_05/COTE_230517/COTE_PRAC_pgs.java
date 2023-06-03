package COTE_2023_05.COTE_230517;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class COTE_PRAC_pgs {

	public static void main(String[] args) {
	
		String[] players = {"mumu", "soe", "poe", "kai", "mine"};
		
		String[] callings = {"kai", "kai", "mine", "mine"};
		
		String tmpStr = "";
        
		String[] answer= new String[players.length];
		
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < players.length; i++) {
        	answer[i] = players[i];
            map.put(players[i], i+1);
        }
        for(int j = 0; j < callings.length; j++) {
            int grade = 0;
            
            grade = map.get(callings[j]);
            map.put(callings[j], map.get(callings[j])-1);
            
            tmpStr = answer[grade-2];
            map.put(answer[grade-2], map.get(answer[grade-2]) + 1);
            answer[grade-2] = answer[grade-1];
            answer[grade-1] = tmpStr;
        }
		
        System.out.println(Arrays.toString(answer));
	}
	
}
