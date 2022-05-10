package COTE_220510;

public class COTE_YAKSU {
    public static void main(String[] args) {
        int a = 13, b = 17;
        Solution s = new Solution();
        System.out.println(s.solution(a, b));
    }
}
class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for(int i = left; i <= right; i++) {

            for(int j = 1; j <= right; j++) {

                if(i / j == j){
                    answer -= i;
                }
            }
                answer += i;
        }

        return answer;
    }
}