package COTE_2023_03.COTE_230302;

import java.util.Arrays;
import java.util.Comparator;

public class COTE_PRAC_pgs2 {

	public static void main(String[] args) {

		int[][] dots = {{1, 1}, {2, 1}, {2, 2}, {1, 2}};
		
		Arrays.sort(dots, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				return a[1] != b[1] ? b[1] - a[1] : b[0] - a[0];
			}
		});
		
		System.out.println(Arrays.deepToString(dots));
		
	}

}
