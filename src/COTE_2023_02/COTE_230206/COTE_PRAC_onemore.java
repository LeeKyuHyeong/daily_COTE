package COTE_2023_02.COTE_230206;

public class COTE_PRAC_onemore {

	public static void main(String[] args) {

		int[] box = {10, 8, 6};
		int n = 3;
		
		
		int answer = box[0] / n;
        
        for(int i = 1; i < box.length; i++) {
            answer *= (box[i] / n);
        }
		
	}

}
