package COTE_2023_01.COTE_230102;

import java.util.Arrays;

public class COTE_PRAC_pgs {
	public static void main(String[] args) {
		System.out.println(Arrays.deepToString(solution("abc1Addfggg4556b", 6)));
	}

	static String[] solution(String my_str, int n) {

    String[] tmpArr = new String[my_str.length()];    

    int answerLength = my_str.length() % n == 0 ? my_str.length() / n : (my_str.length() / n) + 1;

    for(int i = 0; i < my_str.length(); i++) {

        tmpArr[i] = String.valueOf(my_str.charAt(i));

    }

    String[] answer = new String[answerLength];

    for(int j = 0; j < answerLength; j++) {

        String tmp = "";

        for(int k = n * j; k < n * (j + 1); k++) {

            if(k == my_str.length()) {

                break;

            }
            tmp += tmpArr[k];
        }
        answer[j] = tmp;
    }
    
    return answer;
	}
}