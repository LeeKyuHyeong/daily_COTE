package COTE_220511;
import java.util.TreeSet;
import java.util.Iterator;

public class COTE_TWOforONE {
    public static void main(String[] args) {
        int numbers[] = {2,1,3,4,1};
        int numbers1[] = {1,2,3,4,5,6,7,10};
        Solution s = new Solution();

        System.out.println(s.solution(numbers));
        System.out.println(s.solution(numbers1));
    }
}

class Solution {
    public int[] solution(int[] numbers) {
        int [] answer;
        TreeSet<Integer> intSet = new TreeSet<Integer>();

        for(int i = 0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; i++) {
                intSet.add(numbers[i] + numbers[j]);
            }
        }
        Iterator iter = intSet.iterator();
        answer = new int[intSet.size()];
        while(iter.hasNext()){
            for(int i = 0; i < intSet.size(); i++) {
                answer[i] = Integer.parseInt(iter.next().toString());
            }
        }
        return answer;
    }
}