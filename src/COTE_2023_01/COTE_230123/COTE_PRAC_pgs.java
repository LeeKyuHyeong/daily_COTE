package COTE_2023_01.COTE_230123;

public class COTE_PRAC_pgs {

	public static void main(String[] args) {

		int tmp = 930211;
		String str = String.valueOf(tmp);
		
		String[] strArr = new String[str.length()];
		int sum = 0;
		
		for(int i = 0; i < str.length(); i++) {
			//strArr[i] = str.split("")[i];
			sum += Integer.parseInt(str.split("")[i]);
		}
		
		System.out.println(sum);
		
	}

}
