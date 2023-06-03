package COTE_2023_02.COTE_230228;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class COTE_PRAC_pgs2 {

	public static void main(String[] args) {

		String[] spell = {"z", "d", "x"};
		//String[] spell = {"s", "o", "m", "d"};
		/*
		 * String patternInt = "^[0-9]*$"; Map<String, String> map = new HashMap<>();
		 * 
		 * int score = 1; int sum = 0; int tmp = 0; int result = 2; for(String s :
		 * spell) { sum += score; map.put(s, Integer.toString(score++));
		 * System.out.println(map.get(s)); } int leng = spell.length;
		 * 
		 * //String[] dic = {"moos", "dzx", "smm", "sunmmo", "som"}; String[] dic =
		 * {"def", "dww", "dzx", "loveaw"}; for(int i = 0; i < dic.length; i++) {
		 * if(dic[i].length() != leng) { continue; } for(String s : map.keySet()) {
		 * dic[i] = dic[i].replaceAll(s, map.get(s)); } for(String str :
		 * dic[i].split("")) { if(!Pattern.matches(patternInt, str)) { continue; } tmp
		 * += Integer.parseInt(str); if(sum == tmp) { result = 1; } } }
		 * System.out.println(Arrays.toString(dic)); System.out.println(result);
		 */
		StringBuilder sb = new StringBuilder();
		
		System.out.println("spell : " + Arrays.toString(spell));
		Arrays.sort(spell);
		for(String s : spell) {
			sb.append(s);
		}
		System.out.println("spell : " + Arrays.toString(spell) + ", " + sb);
		//String[] dic = {"moos", "dzx", "smm", "sunmmo", "som", "osmd", "smdo"};
		String[] dic = {"def", "dww", "dzx", "loveaw"};
		
		int leng = spell.length;
		
		List<String> dics = Arrays.asList(dic).stream().filter(item -> item.length() == leng).collect(Collectors.toList());
		
		System.out.println(dics);
		
		for(int i = 0; i < dics.size(); i++) {
			char[] change = dics.get(i).toString().toCharArray();
			Arrays.sort(change);
			
			System.out.println(sb);
			System.out.println(new String(change));
			if(sb.toString().equals(new String(change))) {
				System.out.println("같다");
			}
			
		}
		
		//System.out.println(Arrays.toString(stream.toArray()));
		
	}

}
