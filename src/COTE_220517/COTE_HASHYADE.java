package COTE_220517;

import java.util.ArrayList;
import java.util.List;

public class COTE_HASHYADE {
	public static void main(String[] args) {
		int x = 632;
		List<Integer> intList = new ArrayList<Integer>();
		int sum = 0;
		for(int i = 0; i < String.valueOf(x).length(); i++) {
			sum += (Integer.parseInt(String.valueOf(String.valueOf(x).charAt(i))));
		}
		boolean result;
		result = x % sum == 0 ? true : false;
		System.out.println(result);
	}
	
}
