package COTE_2023_03.COTE_230301;

import java.util.Arrays;

public class COTE_PRAC_pgs {

	public static void main(String[] args) {

		//String[] keyinput = {"left", "right", "up", "right", "right"};
		//String[] keyinput = {"down", "down", "down", "down", "down"};
		/*
		 * String[] keyinput = {}; int[] board = {99, 99};
		 * 
		 * int[] maxLength = {board[0] / 2 , board[1] / 2};
		 * 
		 * Map<String, Integer> map = new HashMap<>();
		 * 
		 * for(String s : keyinput) { map.put(s, map.getOrDefault(s, 0) + 1); }
		 * 
		 * int[] answer = new int[2];
		 * 
		 * int left = map.getOrDefault("left", 0); int right = map.getOrDefault("right",
		 * 0); int up = map.getOrDefault("up", 0); int down = map.getOrDefault("down",
		 * 0);
		 * 
		 * if(maxLength[0] == maxLength[1] && maxLength[0] == 0) { answer[0] = 0;
		 * answer[1] = 0; } else { answer[0] = left == right ? 0 : Math.abs(right -
		 * left) > maxLength[0] ? right > left ? maxLength[0] : maxLength[0] * -1 :
		 * right - left; answer[1] = up == down ? 0 : Math.abs(up - down) > maxLength[1]
		 * ? up > down ? maxLength[1] : maxLength[1] * -1 : up - down; }
		 * 
		 * System.out.println(Arrays.toString(answer));
		 */
		//String[] keyinput = {"left", "left", "right"};
		String[] keyinput = {"left", "right", "up", "right", "right"};
		int[] board = {11, 11};
		int[] maxLength = {board[0] / 2 , board[1] / 2};
		int width = 0;
		int length = 0;
		
		for(String s : keyinput) {
			if(s.equals("left")) {
				width = width - 1 < maxLength[0] * -1 ? maxLength[0] * -1 : width - 1;
			}
			else if(s.equals("right")) {
				width = width + 1 > maxLength[0] ? maxLength[0] : width + 1;
			}
			else if(s.equals("down")) {
				length = length - 1 < maxLength[1] * -1 ? maxLength[1] * -1 : length - 1;
			}
			else {
				length = length + 1 > maxLength[1] ? maxLength[1] : length + 1;
			}
		}
		
		int[] answer = {width, length};
		
		System.out.println(Arrays.toString(answer));
	}

}
