package COTE_2023_01.COTE_230126;

import java.util.ArrayList;
import java.util.List;

public class COTE_PRAC_pgs {

	public static void main(String[] args) {

		int n = 3;
		
		int[] numlist = {4,5,6,7,8,9,10,11,12};
		
		List<Integer> list = new ArrayList<>();
		
		for(int i : numlist) {
			if(i % n == 0) {
				list.add(i);
			}
		}
		System.out.println(list);
	}

}
