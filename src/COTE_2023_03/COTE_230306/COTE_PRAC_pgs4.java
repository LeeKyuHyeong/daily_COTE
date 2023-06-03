package COTE_2023_03.COTE_230306;

import java.time.LocalDate;

public class COTE_PRAC_pgs4 {

	public static void main(String[] args) {

		int a = 5, b = 24;
		
		String answer = "";
		
		
		LocalDate date = LocalDate.of(2016, a, b);
		
		answer = date.getDayOfWeek().toString().substring(0, 3);
		
		
		
		System.out.println(answer);
		
	}

}
