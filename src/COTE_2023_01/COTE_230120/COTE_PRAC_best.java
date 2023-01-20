package COTE_2023_01.COTE_230120;

import java.util.Arrays;

public class COTE_PRAC_best {

	public static void main(String[] args) {

		String[] strArr = {"3 + 5 = 2","2 - 5 = -2"};
		
		System.out.println(Arrays.deepToString(solution2(strArr)));
		
	}
//	static String[] solution(String[] quiz) {
//		return Arrays.stream(quiz).map(s -> {
//            String[] arr = s.trim().split(" ");
//            return arr[1].equals("+") && Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]) == Integer.parseInt(arr[4]) 
//            		|| Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]) == Integer.parseInt(arr[4]) ?
//            				"O" : "X";
//        }).toArray(String[]::new);
//	}
	static String[] solution2(String[] quiz) {
		return Arrays.stream(quiz).map(t -> {
			String[] answerArr = t.trim().split(" ");
			return answerArr[1].equals("+") && Integer.parseInt(answerArr[0]) + Integer.parseInt(answerArr[2]) == Integer.parseInt(answerArr[4]) ||
					Integer.parseInt(answerArr[0]) - Integer.parseInt(answerArr[2]) == Integer.parseInt(answerArr[4]) ?
							"O" : "X";
		}).toArray(String[]::new);
	}
}
