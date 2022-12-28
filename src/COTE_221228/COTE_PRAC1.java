package COTE_221228;

public class COTE_PRAC1 {

	public static void main(String[] args) {

		// "aya", "ye", "woo", "ma"
		
		// ["aya", "yee", "u", "maa", "wyeoo"]
		// ["ayaye", "uuuma", "ye", "yemawoo", "ayaa"]
		
		String[] strArr = {"aya", "yee", "u", "maa", "wyeoo"};
		//String[] strArr = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
		
		/*
		 * for(String s : strArr) { System.out.println(s); s = s.replaceAll("aya", " ");
		 * 
		 * s = s.replaceAll("ye", ""); s = s.replaceAll("woo", ""); s =
		 * s.replaceAll("ma", ""); System.out.println(s); }
		 */
		
		
		Solution s = new Solution();
		
		System.out.println(s.solution(strArr));
		
	}

}
class Solution {
	public int solution(String[] babbling) {
		int answer = 0;
		
		for(String s : babbling) {
			s=s.replaceAll("aya", " ");
			s=s.replaceAll("ye", " ");
			s=s.replaceAll("woo", " ");
			s=s.replaceAll("ma", " ");
			System.out.println(s);
			if(s.trim().equals("")) {
				answer++;
			}
		}
				
		return answer;
	}
}