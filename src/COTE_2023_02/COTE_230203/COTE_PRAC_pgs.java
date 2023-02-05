package COTE_2023_02.COTE_230203;

public class COTE_PRAC_pgs {

	public static void main(String[] args) {

		String str = "2000 + 331 + 12 - 331";
		
		int answer = Integer.parseInt(str.split(" ")[0]);
		
		for(int i = 1; i < str.split(" ").length; i++) {
			
			if(i % 2 != 0) {

				if(str.split(" ")[i].equals("+")) {
					answer += Integer.parseInt(str.split(" ")[i+1]);
				} else {
					answer -= Integer.parseInt(str.split(" ")[i+1]);
				}
				
			}
		}
				
		System.out.println(answer);
		
	}

}
