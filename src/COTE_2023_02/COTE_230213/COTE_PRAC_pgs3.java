package COTE_2023_02.COTE_230213;

public class COTE_PRAC_pgs3 {

	public static void main(String[] args) {

		int[] numArr = {-100000, 100000};
		
		int MAX = -1000000000;
		
		for(int i = 0; i < numArr.length; i++) {
			for(int j = i+1; j < numArr.length; j++) {
				if(MAX < numArr[i] * numArr[j]) {
					MAX = numArr[i] * numArr[j];
				}
			}
		}
		
		System.out.println(MAX);
		
	}

}
