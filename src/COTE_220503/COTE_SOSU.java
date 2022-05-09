package COTE_220503;

import java.util.ArrayList;
import java.util.List;

public class COTE_SOSU {

}
class Solution4 {
	public int solution(int[] nums) {
		int result = 0;
		List<Integer> intList = new ArrayList<Integer>();
		
		int sum = 0;
		
		for(int i = 0; i < nums.length; i++) {
			intList.add(nums[i]);
			if(intList.size() == 3) {
				for(int j : intList) {
					sum += j;
					if(sum % 2 != 0) {
						
					}
				}
				intList.clear();
			}
		}
		
		
		
		
		
		return result;
	}
}