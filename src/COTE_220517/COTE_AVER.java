package COTE_220517;

import java.util.Arrays;

public class COTE_AVER {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4};
		int sum = 0;
		for(int i : arr) {
			sum += i;
		}
		System.out.println((double)sum / arr.length);
		
		System.out.println(Arrays.stream(arr).average().getAsDouble());
	}

}
