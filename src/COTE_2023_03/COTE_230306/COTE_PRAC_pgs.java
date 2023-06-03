package COTE_2023_03.COTE_230306;


public class COTE_PRAC_pgs {

	public static void main(String[] args) {

		int[][] dots = {
				{1, 4},
				{9, 2},
				{3, 8},
				{11, 6}
		};
		int answer = 0;
		
		double[] dotsX = new double[dots.length];
		double[] dotsY = new double[dots.length];
		
		for(int i = 0; i < dots.length; i++) {
			dotsX[i] = dots[i][0];
			dotsY[i] = dots[i][1];
		}
		
		if ((dotsY[1] - dotsY[0]) / (dotsX[1] - dotsX[0]) == (dotsY[3] - dotsY[2]) / (dotsX[3] - dotsX[2])) {
			answer = 1;
		}
		if ((dotsY[2] - dotsY[0]) / (dotsX[2] - dotsX[0]) == (dotsY[3] - dotsY[1]) / (dotsX[3] - dotsX[1])) {
			answer = 1;
		}
		if ((dotsY[3] - dotsY[0]) / (dotsX[3] - dotsX[0]) == (dotsY[2] - dotsY[1]) / (dotsX[2] - dotsX[1])) {
			answer = 1;
		}
			
		
		
		System.out.println(answer);
	}

}
