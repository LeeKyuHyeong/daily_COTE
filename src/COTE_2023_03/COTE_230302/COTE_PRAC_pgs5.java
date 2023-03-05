package COTE_2023_03.COTE_230302;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class COTE_PRAC_pgs5 {
	public static void main(String[] args) {
		
		String polynomial = "3x + 7 + x";
		StringBuilder sb = new StringBuilder();
		
		Map<String, String> map = new HashMap<>();
		
		
		//String[] strArr = polynomial.split(" + ");
		
		List<String> strList = new ArrayList<>();
		
		for(String s : polynomial.split(" ")) {
			strList.add(s);
		}
		
		System.out.println(strList.get(0));
		//System.out.println(Arrays.toString(strArr));
		
		
	}
}
