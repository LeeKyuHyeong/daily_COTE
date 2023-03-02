package COTE_2023_02.COTE_230227;

import java.util.Arrays;

public class LottoMaker {

	public static void main(String[] args) {
		int j = 1;
		
		while(j <= 5) {
			
			int[] lotto = new int[45];
			
			for(int i = 0; i < lotto.length; i++) {
				lotto[i] = i + 1;
			}
			
			int tmp = 0;
			for(int i = 0; i < lotto.length; i++) {
				int ran = (int)(Math.random() * 45);
				
				tmp = lotto[i];
				lotto[i] = lotto[ran];
				lotto[ran] = tmp;
				
			}
			
			int[] today = Arrays.copyOf(lotto, 6);
			Arrays.sort(today);
			int bonus = lotto[6];
			
			System.out.println(j+"번째 : " + Arrays.toString(today) + " bonus : " + bonus);
			
			j++;
		}
		
	}

}
