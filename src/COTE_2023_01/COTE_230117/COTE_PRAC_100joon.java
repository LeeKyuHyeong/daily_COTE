package COTE_2023_01.COTE_230117;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class COTE_PRAC_100joon {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int len = Integer.parseInt(br.readLine());
		int tmp = 0;

		Map<String, String> map = new TreeMap<>();

		while (len > tmp) {

			String inputStr = br.readLine();

			map.put(inputStr, String.valueOf(inputStr.length()));

			tmp++;

		}

		String[][] strArr = new String[map.size()][2];

		Iterator<String> iter = map.keySet().iterator();
		int tmp1 = 0;

		while (iter.hasNext()) {
			String next = iter.next();
			strArr[tmp1][0] = next;
			strArr[tmp1][1] = map.get(next);
			System.out.println(next + ", " + map.get(next));
			tmp1++;
		}

		Arrays.sort(strArr, new Comparator<String[]>() {

			@Override
			public int compare(String[] o1, String[] o2) {
				if (o1[1].toString().equals(o2[1].toString()))
					return o1[0].toString().compareTo(o2[0].toString());
				else
					return o1[1].toString().compareTo(o2[1].toString());
			}
		});
		
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i][0]);
		}

//		List<Integer> list = new ArrayList<>();
//		
//		for(int i = strArr.length - 1; i > 0; i--) {
//			if(strArr[i][0].equals(strArr[i-1][0])) {
//				list.add(i);
//			}
//		}
//		System.out.println(Arrays.deepToString(list.toArray()));

	}

}
