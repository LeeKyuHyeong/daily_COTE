package COTE_2023_03.COTE_230306;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class COTE_PRAC_pgs6 {

	public static void main(String[] args) {

		
		int[] arr = {4, 4, 4, 3, 3, 4, 4};
		
		
		List<Integer> intList = new ArrayList<>();
		
		for(int i = 0; i < arr.length; i++) {
			if(i > 0) {
				if(arr[i] == arr[i-1]) {
					continue;
				} else {
				}
			}
			intList.add(arr[i]);
		}
		
		int[] answer = new int[intList.size()];
		
		for(int i = 0; i < intList.size(); i++) {
			answer[i] = intList.get(i);
		}
		
	}

}
