package COTE_220521;

public class COTE_PRAC1 {
	public static void main(String[] args) {
		
		String s = "aabbaccc";
		
		char[] chArr = s.toCharArray();
		
		String tmp = "";
		
		System.out.println(tmp + chArr[0] + 'a');
		for(int i = 0; i < chArr.length; i++) {
			if(chArr[0] == chArr[1]) {
				
			} else if(tmp + chArr[0] + chArr[1] == tmp + chArr[2] + chArr[3]) {
				
			} else if(tmp + chArr[0] + chArr[1] + chArr[2] == tmp + chArr[3] + chArr[4] + chArr[5]) {
				
			}
		}
		System.out.println(" 건하커플은 건하가 좀 더 감수성이다. ");

		System.out.println("하지만 이제는 혼자다");

		System.out.println("하지만 다음주에 소개팅하러 간다! 새로운 만남!");
		
	}
}
