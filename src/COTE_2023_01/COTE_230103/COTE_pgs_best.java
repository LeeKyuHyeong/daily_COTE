package COTE_2023_01.COTE_230103;

public class COTE_pgs_best {

	public static void main(String[] args) {

		int answer = 0;
		
		int[] array = {1, 17, 72, 77};
		
		for(int i : array) {
			while(i > 0) {
				if(i % 10 == 7) answer++;
				i /= 10;
			}
		}
		
		System.out.println(answer);
	}

}
