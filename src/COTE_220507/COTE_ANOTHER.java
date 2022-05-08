package COTE_220507;

public class COTE_ANOTHER {
	
}
class Solution1 {
	public int solution(String s) {
		int answer = 0; 
		int len = s.length();
		String num[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
		String str[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		
		for(int i = 0; i < num.length; i++) {
			s = s.replaceAll(str[i], num[i]);
		}
		
		return Integer.parseInt(s);
	}
}