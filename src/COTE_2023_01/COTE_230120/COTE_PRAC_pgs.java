package COTE_2023_01.COTE_230120;

import java.util.Arrays;

import javax.script.ScriptException;

public class COTE_PRAC_pgs {

	public static void main(String[] args) throws ScriptException {

		String quiz[] = {"3 - 4 = -3", "5 + 6 = 11"};
		
		int tmp = 0;
		
		String answer[] = new String[quiz.length];
		
		while(tmp < quiz.length) {
			String tmpArr[] = quiz[tmp].split(" ");
			
			boolean flag = false;
			if( tmpArr[1].equals("-") ) {
				if (Integer.parseInt(tmpArr[0]) - Integer.parseInt(tmpArr[2]) == Integer.parseInt(tmpArr[4])) 
					flag = true;

			} else {
				if (Integer.parseInt(tmpArr[0]) + Integer.parseInt(tmpArr[2]) == Integer.parseInt(tmpArr[4])) 
					flag = true;
			}
			
			answer[tmp] = flag ? "O" : "X";
			tmp++;
			
		}
		
		System.out.println(Arrays.toString(answer));
		
	}

}
