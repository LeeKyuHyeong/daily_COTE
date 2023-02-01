package COTE_2023_02.COTE_230201;

public class COTE_PRAC_pgs {

	public static void main(String[] args) {

		String[] s1 = {"a", "b", "c"};
		
		String[] s2 = {"com", "b", "d", "p", "c"};
		int result = 0;
		
		if (s1.length > s2.length) {
			System.out.println("s1 가 더 크다");
			for(int i = 0; i < s2.length; i++) {
				for(int j = 0; j < s1.length; j++) {
					if(s1[j].equals(s2[i])) result++;
				}
			}
		} else {
			System.out.println("s2 가 더 크다");
			
			for(int i = 0; i < s1.length; i++) {
				
				for(int j = 0; j < s2.length; j++) {
					if(s2[j].equals(s1[i])) result++;
				}
			}
			
		}
		
		System.out.println(result);
	}

}
