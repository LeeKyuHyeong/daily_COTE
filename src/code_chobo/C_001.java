package code_chobo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C_001 {

	
	public static void main(String[] args) {
		MyFunction f = (a, b) -> a > b ? a : b;
		
		System.out.println(f.min(3, 5));
		
		List<String> list = Arrays.asList("abc", "Aaa", "bbb");
		
		Collections.sort(list, (s1, s2) -> s1.compareTo(s2));
		
		System.out.println(list);
		
	}
}
