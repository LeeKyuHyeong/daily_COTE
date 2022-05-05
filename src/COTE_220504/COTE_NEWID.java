package COTE_220504;

import java.util.ArrayList;
import java.util.List;

public class COTE_NEWID {
	public static void main(String[] args) {

		char ch = 'a';
		System.out.println((int) ch);
		System.out.println("- : " + (int) '-');
		System.out.println("_ : " + (int) '_');
		System.out.println(". : " + (int) '.');
		System.out.println("! : " + (int) '!');
		System.out.println("@ : " + (int) '@');
		System.out.println("# : " + (int) '#');
		System.out.println("* : " + (int) '*');
		System.out.println("========================================");
		String new_id = "...!@BaT#*..y.abcdefghijklm";

		int[] int_Arr = new int[new_id.length()];
		char[] char_Arr = new char[new_id.length()];

		int length = int_Arr.length;
		for (int i = 0; i < new_id.length(); i++) {
			int_Arr[i] = (int) new_id.charAt(i);
		}
		출력(0, int_Arr, char_Arr);

		for (int i = 0; i < length; i++) {
			if (int_Arr[i] < 91 && int_Arr[i] > 64) {
				int_Arr[i] += 32;
			}
		}
		출력(1, int_Arr, char_Arr);
		
		for(int i = 0; i < length; i++) {
			if (int_Arr[i] > 32 && int_Arr[i] < 48) {				
				if(int_Arr[i] != 45 || int_Arr[i] != 46) {
					int_Arr[i] = 0;
				} else {
					continue;
				}
					
			} else if(int_Arr[i] > 90 && i < 97) {
				if(int_Arr[i] != 95) {
					int_Arr[i] = 0;
				} else {
					continue;
				}
			} else if(int_Arr[i] > 122 || (int_Arr[i] > 57 && int_Arr[i] < 65)) {
					int_Arr[i] = 0;
				}
			else {
				continue;
			}
		}
//		for (int i : int_Arr) {
//			if (i > 32 && i < 48) {
//				System.out.println(i);
//				if (i != 45 || i != 46) {
//					i = 0;
//					System.out.println(i);
//					continue;
//				}
//			} else if (i > 90 && i < 97) {
//				if (i != 95) {
//					i = 0;
//					continue;
//				}
//			} else if (i > 122 || (i > 57 && i < 65)) {
//				i = 0;
//				continue;
//			}
//		}
		출력(2, int_Arr, char_Arr);
		for (int j = 0; j < length; j++) {
			if (int_Arr[j] == 46) {
				int_Arr[j + 1] = int_Arr[j] == int_Arr[j + 1] ? 0 : int_Arr[j + 1];
			}
		}
		출력(3, int_Arr, char_Arr);
		if (int_Arr[0] == 46)
			int_Arr[0] = 0;
		if (int_Arr[length - 1] == 46)
			int_Arr[length - 1] = 0;

		출력(4, int_Arr, char_Arr);
	}

	public static void 출력(int cnt, int[] intArr, char[] charArr) {
		for (int i = 0; i < intArr.length; i++) {
			charArr[i] = (char) intArr[i];
		}
		System.out.println(cnt + "단계 : " + new String(charArr));
	}
}

class Solution {
	public String solution(String new_id) {
		String answer = "";
		int[] int_Arr = new int[new_id.length()];
		char[] char_Arr = new char[new_id.length()];

		int length = int_Arr.length;
		for (int i = 0; i < new_id.length(); i++) {
			int_Arr[i] = (int) new_id.charAt(i);
		}

		for (int i : int_Arr) {
			if (i < 91 && i > 64) {
				i = (i + 32);
			} else if (i > 32 && i < 48) {
				if (i != 45 || i != 46)
					i = 0;
			} else if (i > 90 && i < 97) {
				if (i != 95)
					i = 0;
			} else if (i > 122 || (i > 57 && i < 65))
				i = 0;
		}
		for (int j = 0; j < length; j++) {
			if (int_Arr[j] == 46) {
				int_Arr[j + 1] = int_Arr[j] == int_Arr[j + 1] ? 0 : int_Arr[j + 1];
			}
		}
		if (int_Arr[0] == 46)
			int_Arr[0] = 0;
		if (int_Arr[length - 1] == 46)
			int_Arr[length - 1] = 0;

		for (int i = 0; i < length; i++) {
			char_Arr[i] = (char) int_Arr[i];
		}
		System.out.println(new String(char_Arr));

//		for(char ch : new_id_arr) {
//			
//			if((int)ch < 91 && (int)ch > 64) {
//				ch = (char)((int)ch + 32);
//			}
//		}

		return answer;
	}
}