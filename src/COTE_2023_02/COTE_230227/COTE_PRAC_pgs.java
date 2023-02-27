package COTE_2023_02.COTE_230227;

public class COTE_PRAC_pgs {

	public static void main(String[] args) {

		String[] id_pw = {"id1", "pwd1"};
		
		String[][] db = {{"id2", "pwd2"}, {"id3", "pwd3"}};
		
		String answer = "";
		
		for(int i = 0; i < db.length; i++) {
			if(id_pw[0].equals(db[i][0])) {
				if(id_pw[1].equals(db[i][1])) {
					answer = "login";
					break;
				} else {
					answer = "wrong pw";
					break;					
				}
			} else {
				answer = "fail";
			}
		}
		System.out.println(answer);
	}

}
