package COTE_220501;

import java.util.HashMap;

public class COTE_PLAYER {

	public static void main(String[] args) {

	}

}
class Solution {
	public String solution(String[] participant, String[] completion) {
        String tmp = "";
        
        HashMap<String, Integer> map = new HashMap<>();
        for(String player : participant)
            map.put(player, map.getOrDefault(player, 0) + 1);
        for(String player : completion)
            map.put(player, map.get(player) - 1);
            
        for(String player : map.keySet()){
            if(map.get(player) != 0){
                tmp = player;
            }
        }
            
        return tmp;
    }
}