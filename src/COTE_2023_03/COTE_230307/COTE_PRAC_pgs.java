package COTE_2023_03.COTE_230307;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class COTE_PRAC_pgs {

	public static void main(String[] args) {

		List<Integer> intList = new ArrayList<>();
		
		intList.add(10);
		intList.add(2);
		
		//Collections.sort(intList);
		//intList.sort(Comparator.naturalOrder());
		//System.out.println(intList);
		
		int a = 3, b = 5;
		
		int tmp = a;
		
		//System.out.println(a + ", " + b + ", " + tmp);
		
		a = a > b ? a : b;
		b = tmp > b ? b : tmp;
		
		//System.out.println(a + ", " + b + ", " + tmp);
		String abc = "aBcE";
		abc = abc.toLowerCase();
		
		String[] strings = {"abce", "abcd", "cdx"};
		int n = 2;
		
		String[][] str = new String[3][2];
        
        for(int i = 0; i < str.length; i++) {
            str[i][0] = strings[i];
            str[i][1] = strings[i].split("")[n];
            System.out.println(strings[i].split("")[n]);
        }
        
        Arrays.sort(str, new Comparator<String[]>() {
            public int compare(String[] a, String[] b) {
                return !a[1].equals(b[1]) ? a[1].compareTo(b[1]) : a[0].compareTo(b[0]);
            }
        });
        
        String[] answer = new String[3];
        
        for(int j = 0; j < answer.length; j++) {
            answer[j] = str[j][0];
        }
		System.out.println(Arrays.toString(answer));
		
	}

}
