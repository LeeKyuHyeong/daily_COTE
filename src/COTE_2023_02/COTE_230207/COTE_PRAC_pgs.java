package COTE_2023_02.COTE_230207;

import java.util.Set;
import java.util.TreeSet;

public class COTE_PRAC_pgs {

	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>();
		
		int n = 1;
		if(n == 1) {
            set.add(1);
        } else {
			for(int i = 1; i < n / 2; i++) {
				if(n % i == 0) {
					set.add(i);
					set.add(n / i);
				}
			}
        }
		System.out.println(set);
	}

}
