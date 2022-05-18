package COTE_220518;

public class COTE_PHONE {
	public static void main(String[] args) {

		String num = "0233334444";
		char[] charArr = num.toCharArray();

		System.out.println(num.length());
		for (int i = 0; i < num.length(); i++) {
			
			charArr[i] = i < charArr.length-4 ? '*' : num.charAt(i);
			
			System.out.println(new String(charArr));
		}

	}
}
