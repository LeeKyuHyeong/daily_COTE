package COTE_220502;

public class COTE_ANOTHER_ANSWER {

}
class Solution1 {
	public int solution(int[] numbers) {
		int sum = 45;
        for (int i : numbers) {
            sum -= i;
        }
        return sum;
	}
}