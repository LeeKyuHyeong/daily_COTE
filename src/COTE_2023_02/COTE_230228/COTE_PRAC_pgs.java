package COTE_2023_02.COTE_230228;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class COTE_PRAC_pgs {

	public static void main(String[] args) {

		
		int[][] score = {{80, 70}, {90, 60}, {40, 70}, {60, 90}};
		//int[][] score = {{80, 70}, {80, 70}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};
		
		int[] answer = new int[score.length] ;
		
		int[][] newScore = new int[score.length][score[0].length];
		
		int[][] sumScore = Arrays.copyOf(newScore, newScore.length);
        for(int i = 0; i < score.length; i++) {
        	newScore[i][1] = score[i][0] + score[i][1];
        	
            newScore[i][0] = i+1;
        }
        
        System.out.println(Arrays.deepToString(sumScore));
        
        Arrays.sort(newScore, new Comparator<int[]>(){
        	public int compare(int[] arr1, int[] arr2) {
        		return arr1[1] != arr2[1] ? arr2[1] - arr1[1] : arr1[0] - arr2[0];
        	}
        });
        System.out.println(Arrays.deepToString(newScore));
        
        int rank = 1;
        for(int i = 0; i < score.length; i++) {
        	
        	if(i > 0) {
        		if(newScore[i][1] == newScore[i-1][1]) {
        			newScore[i][0] = newScore[i-1][0];
        		} else {
        			newScore[i][0] = rank;
        		}
        	} else {
        		newScore[i][0] = rank;
        	}
        	rank++;
        }
        
        
//        int tmp = 0;
        for(int j = 0;  j < newScore.length; j++) {
        	answer[j] = newScore[j][0];
        }
        
        System.out.println(Arrays.toString(answer));
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < answer.length; i++) {
        	map.put(newScore[i][1], answer[i]);
        }
        
        for(int i : map.keySet()) {
        	System.out.print(i + ", " + map.get(i) + "\t");
        }
        System.out.println();
        int[] result = new int[answer.length];
        for(int i = 0; i < result.length; i++) {
        	result[i] = map.get(sumScore[i][1]);
        }
        
        System.out.println(Arrays.toString(result));
        
	}

}
