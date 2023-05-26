package COTE_2023_05.COTE_230523;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class COTE_PRAC_pgs_181188 {

	public static void main(String[] args) {
		
		int[][] targets = {
				{4, 5},
				{4, 8},
				{10, 14},
				{11, 13},
				{5, 12},
				{3, 7},
				{1, 4}
		};
		
		System.out.println(solution(targets));
		
	}
	
	public static int solution(int[][] targets) {
		
		int result = 0;
		
		
		System.out.println(Arrays.deepToString(targets));
		
		Arrays.sort(targets, (o1, o2) -> {
			if(o1[1] == o2[1]) {
				return o1[0] - o2[0];
			}
			return o1[1] - o2[1];
		});
		
		System.out.println(Arrays.deepToString(targets));
		
		int cut = -1;
		
		for(int i = 0; i < targets.length; i++) {
			int left = targets[i][0];
			int right = targets[i][1];
			if(left >= cut) {
				result++;
				cut = right;
			}
		}
		
		
		 
		return result;
	}
	
}
