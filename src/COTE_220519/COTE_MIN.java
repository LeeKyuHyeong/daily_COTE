package COTE_220519;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class COTE_MIN {
	public static void main(String[] args) {
		
		int[] arr = {10};
		//int[] arr = {4,3,1,2,5};
		
		List<Integer> intList = new ArrayList<>();
		
		
		int k = 0;
		int[] answer = {};
		if(arr.length < 2) {
			answer = new int[1];
			answer[0] = -1;
		} else {
			answer = new int[arr.length-1];
			int min = arr[0];
			for(int i = 1; i < arr.length; i++) {
				if(min > arr[i]) {
					min = arr[i];
				}
			}
			
			for(int j = 0; j < arr.length; j++) {
				if(arr[j] == min) {
					continue;
				}
				intList.add(arr[j]);
			}
			for(int i : intList) {
				answer[k] = i;
				k++;
			}
		}
		System.out.println(Arrays.toString(answer));
		
	}
}
