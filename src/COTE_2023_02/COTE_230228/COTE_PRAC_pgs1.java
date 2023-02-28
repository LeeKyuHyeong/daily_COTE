package COTE_2023_02.COTE_230228;

public class COTE_PRAC_pgs1 {

	public static void main(String[] args) {

		int[] sides = {3, 6};
		
		int answer = 0;
		
		if(sides[0] > sides[1]) {
            answer = (sides[0] + sides[1]) - (sides[0] - sides[1]) - 1;
        } else {
            answer = (sides[1] + sides[0]) - (sides[1] - sides[0]) - 1;
        }
		
		System.out.println(answer);
		
	}

}
