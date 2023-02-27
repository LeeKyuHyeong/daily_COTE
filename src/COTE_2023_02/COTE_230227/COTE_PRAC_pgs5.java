package COTE_2023_02.COTE_230227;

public class COTE_PRAC_pgs5 {
	public static void main(String[] args) {
		
		//String s = "1 2 Z 3";
		String s = "10 Z 20 Z";
		
		int beforeInt = 0;
		
		int sum = 0;
		
		for(String str : s.split(" ")) {
			if(str.equals("Z")) {
				sum -= beforeInt;
			} else {
				beforeInt = Integer.parseInt(str);
				sum += Integer.parseInt(str);
			}
		}
		System.out.println(sum);
	}
}
