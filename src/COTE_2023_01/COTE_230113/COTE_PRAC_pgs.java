package COTE_2023_01.COTE_230113;

import java.util.Arrays;
import java.util.Comparator;

public class COTE_PRAC_pgs {

	public static void main(String[] args) {

		String str1 = "it";
		String str2 = "im";
		String str3 = "but";
		String str4 = "no";
		
		System.out.println(str1.compareTo(str2));
		System.out.println(str3.compareTo(str4));

		String[] strArr = {str1, str2, str3, str4};
		
		System.out.println(Arrays.deepToString(strArr));
		
		//Arrays.sort(strArr);
		Arrays.sort(strArr, new Comparator<String>() {
			public int compare(String s1, String s2) {
				if(s1.length() == s2.length()) {
					return s2.compareTo(s1);
				} else {
					return s2.length() - s1.length();
				}
				
			}
		});
		
		System.out.println(Arrays.deepToString(strArr));
	}

}
