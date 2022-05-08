package COTE_220507;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class COTE_ENGtoNum {
	public static void main(String[] args) {
		
		String s1 = "one4seveneight";
		String s2 = "2three45sixseven";
		Solution s = new Solution();
		
		System.out.println(s.solution(s1));
		System.out.println(s.solution(s2));
	}
}
class Solution {
	public int solution(String s) {
		List<Map<String, Integer>> listMap = new ArrayList<Map<String, Integer>>();
		Map<String, Integer> map = new HashMap<>();
		
		map.put("zero", 0);
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("four", 4);
		map.put("five", 5);
		map.put("six", 6);
		map.put("seven", 7);
		map.put("eight", 8);
		map.put("nine", 9);
		
		listMap.add(map);
		System.out.println(listMap.get(0));
		System.out.println(listMap.get(0).keySet());
		
		List<Integer> intList = new ArrayList<Integer>();
		
		char charArr[] = new char[s.length()];
		for(int i = 0; i < charArr.length; i++) {
			charArr[i] = s.charAt(i);
		}
		
		String tmp = "";
		for(int i = 0; i < charArr.length; i++) {
			if(charArr[i] >= 49 && charArr[i] <= 57) {
				
				intList.add(-48 + (int)charArr[i]);
				continue;
			} else {
				tmp += charArr[i];
				for(String str : listMap.get(0).keySet()) {
					if(tmp.equals(str)) {
						intList.add(listMap.get(0).get(tmp));
						tmp = "";
					}
				}
				
//				switch(tmp) {
//				case "zero" :
//					intList.add(0);
//					tmp = "";
//					break;
//				case "one" :
//					intList.add(1);
//					tmp = "";
//					break;
//				case "two" :
//					intList.add(2);
//					tmp = "";
//					break;
//				case "three" :
//					intList.add(3);
//					tmp = "";
//					break;
//				case "four" :
//					intList.add(4);
//					tmp = "";
//					break;
//				case "five" :
//					intList.add(5);
//					tmp = "";
//					break;
//				case "six" :
//					intList.add(6);
//					tmp = "";
//					break;
//				case "seven" :
//					intList.add(7);
//					tmp = "";
//					break;
//				case "eight" :
//					intList.add(8);
//					tmp = "";
//					break;
//				case "nine" :
//					intList.add(9);
//					tmp = "";
//					break;
//				default :
//					continue;
//				}
			}
		}
		System.out.println(intList);
		System.out.println(tmp);
		
		for(int i : intList) {
			tmp += i;
		}
		int result = Integer.parseInt(tmp);
		
		return result;
	}
}