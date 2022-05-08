package COTE_220507;

public class COTE_ANOTHER {
	
}
class Solution1 {
	public int solution(String s) {
		//String num[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
		String str[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		
		for(int i = 0; i < str.length; i++) {
			//s = s.replaceAll(str[i], num[i]);
			s = s.replaceAll(str[i], Integer.toString(i));
		}
		
		return Integer.parseInt(s);
	}
}