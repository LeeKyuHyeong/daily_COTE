package COTE_2023_03.COTE_230306;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class COTE_PRAC_pgs {

	public static void main(String[] args) {

		int[][] dots = {
				{1, 4},
				{9, 2},
				{3, 8},
				{11, 6}
		};
		
		Arrays.sort(dots, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				return b[0] != a[0] ? b[0] - a[0] : b[1] - a[1];
			}
		});
		
		System.out.println(Arrays.deepToString(dots));
		
		List<int[]> intArrList = new ArrayList<>();
		
		for(int i = 0; i < dots.length - 1; i++) {
			
			for(int j = 0; j < dots[i].length; j++) {
				
				for(int k = i + 1; k < dots.length; k++) {
					
					System.out.println("dots[i][j] : " + dots[i][j]);
					System.out.println("dots[k][j] : " + dots[k][j]);
					
				}
				
			}
			
		}
		
		
	}

}
