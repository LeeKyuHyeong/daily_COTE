package COTE_2023_03.COTE_230302;

import java.util.Arrays;
import java.util.Comparator;

public class COTE_PRAC_pgs {

	public static void main(String[] args) {

		//int[] numlist = {1,2,3,4,5,6};
		int[] numlist = {100000, 20, 36, 47, 40, 6, 10, 7000};
		int n = 30;
		
		int[][] distance = new int[numlist.length][2];
		
		for(int i = 0; i < distance.length; i++) {
			distance[i][0] = numlist[i];
			distance[i][1] = n > numlist[i] ? n - numlist[i] : numlist[i] - n;
		}
		
		Arrays.sort(distance, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				return a[1] != b[1] ? a[1] - b[1] : b[0] - a[0];
			}
		});
		
		
		int[] answer = new int[numlist.length];
		
		for(int i = 0; i < answer.length; i++) {
			answer[i] = distance[i][0];
		}
		
	}

}
