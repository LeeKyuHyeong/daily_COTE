package COTE_220518;

import java.util.ArrayList;
import java.util.List;

public class COTE_MAX_DIVISOR {
	public static void main(String[] args) {
		
		int[] answer = new int[2];
		int n = 4;
		int m = 12;
		if(n == 1 && m == 1) {
			answer[0] = 1;
			answer[1] = 1;
		}
		List<Integer> intminList = new ArrayList<>();
		List<Integer> intmaxList = new ArrayList<>();
		     
		List<Integer> minList = new ArrayList<>();
		List<Integer> maxList = new ArrayList<>();
		int tmp = 0;
		
		for(int i = 1; i <= n; i++) {
			intminList.add(n % i == 0 ? i : 0);
		}
		for(int j = 1; j <= m; j++) {
			tmp = m % j == 0 ? j : 0;
			
			for(int i = 0; i < n; i++) {
				if(tmp == intminList.get((int)i) && tmp != 0) {
					minList.add(tmp);
				}
			}
			
		}
		int x = n;
		for(int i = 1; i <= 50; i++) {
			x = n * (i+1);
			intmaxList.add(x);
		}
		int y = m;
		for(int j = 1; j <= 50; j++) {
			y = m * j;
			for(int i = 0; i <= 47; i++) {
				if(y == intmaxList.get(i) && y != 0) {
					maxList.add(y);
				}
			}
		}
	}
}
