package COTE_220509;

public class COTE_NAEJUCK {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4};
		int[] arr1 = {-3, -1, 0, 2};
		
		Solution s = new Solution();
		
		System.out.println(s.solution(arr, arr1));
	}
}
class Solution {
	public int solution(int[] a, int[] b) {
		int result = 0;
		
		for(int i = 0; i < a.length; i++) {
			result += a[i] * b[i];
		}
		
		return result;
	}
}