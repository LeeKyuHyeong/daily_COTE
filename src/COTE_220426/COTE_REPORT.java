package COTE_220426;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class COTE_REPORT {
	public static void main(String[] args) {
		
	}
}
// 신고 결과 받기
class Solution {
	public int[] solution(String[] id_list, String[] report, int k) {
		
		List<String> strList = Arrays.stream(report).distinct().collect(Collectors.toList());
		
		Map<String, Integer> cnt = new HashMap<>();
		
//		for(String s : strList) {
//			
//		}
		strList.forEach(s -> {
			String target = s.split(" ")[1];
			cnt.put(target, cnt.getOrDefault(target, 0) + 1);
		});
		
		return Arrays.stream(id_list).map(_user -> {
			final String user = _user;
			List<String> reportList = strList.stream().filter(s -> s.startsWith(user + " ")).collect(Collectors.toList());
			return reportList.stream().filter(s -> cnt.getOrDefault(s.split(" ")[1],  0) >= k).count();
		}).mapToInt(Long::intValue).toArray();
	}
}