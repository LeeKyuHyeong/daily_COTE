package COTE_2023_06.COTE_20230618;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class COTE_PRAC_100joon_2501 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		int N = Integer.parseInt(input.split(" ")[0]);
		int cnt = Integer.parseInt(input.split(" ")[1]);
		
		Set<Integer> intList = new TreeSet<>();
		
		for(int i = 1; i <= N / 2; i++) {
			if(N % i == 0) {
				intList.add(i);
				intList.add(N / i);
			}
		}
		
		Integer[] intArr = new Integer[ intList.size() ];
		
		intArr = intList.toArray(intArr);
		
		System.out.println(cnt > intArr.length ? 0 : intArr[cnt-1]);
		
	}

}
