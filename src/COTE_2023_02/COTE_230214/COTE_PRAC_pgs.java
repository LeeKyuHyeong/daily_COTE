package COTE_2023_02.COTE_230214;

public class COTE_PRAC_pgs {

	public static void main(String[] args) {
		int result = 0;
		int i = 1;
		int j = 13;
		int k = 1;
		
		for(int a = i; a <= j; a++) {
            if(a < 10) {
                if(String.valueOf(a).indexOf(String.valueOf(k)) != -1) {
                    result++;
                }
            } else {
                for(String s : String.valueOf(a).split("")) {
                    if(s.indexOf(String.valueOf(k)) != -1) {
                        result++;
                    }
                }
            }
            
        }
		System.out.println(result);
	}

}
