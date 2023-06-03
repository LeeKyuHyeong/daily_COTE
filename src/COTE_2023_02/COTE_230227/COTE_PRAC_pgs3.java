package COTE_2023_02.COTE_230227;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class COTE_PRAC_pgs3 {

	public static void main(String[] args) {

		Set<Integer> intSet = new TreeSet<>();
		int num = 420;
		
		for(int i = 2; i <= num; i++) {
			if(num % i == 0) {
				if(isSosoo(i)) {
					intSet.add(i);
				}
			}
		}
		
		int[] answer = new int[intSet.size()];
		
		Iterator<Integer> iter = intSet.iterator();
		int i = 0;
		while(iter.hasNext()) {
			answer[i] = iter.next();
			
			i++;
		}
		
		System.out.println(Arrays.toString(answer));
		
	}
	
	static boolean isSosoo(int n) {
		
		boolean flag = true;
		
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				flag = false;
			}
		}
		
		return flag;
	}
}
