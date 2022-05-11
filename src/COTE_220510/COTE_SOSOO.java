package COTE_220510;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class COTE_SOSOO {
    public static void main(String[] args) {

    }
}
class Solution2 {
    public int solution(int[] nums) {

        Map<Integer, int[]> map = new HashMap<Integer, int[]>();

        int[] tmp = new int[3];
        for(int k = 0; k < tmp.length; k++) {
            tmp[k] = nums[k];
        }
        map.put(0, tmp);
        System.out.println(Arrays.toString(tmp));

        int i = 0;
        int cnt = 0;
        int j = 0;
        while(j < 1000) {

            tmp[i] = nums[(int)(Math.random()*4)];
            i++;
            cnt++;
            if(cnt == 3) {
                Arrays.sort(tmp);

                map.keySet().forEach(s -> {
                    if(Arrays.equals(tmp, map.get(s))) {
                        reset(tmp);
                    } else {
                        map.put(s, tmp);
                    }
                });

                i = 0;
                cnt = 0;
                j++;

                /*
                 * if(Arrays.equals(map.get(j-1), map.get(j))) { j++; i = 0; cnt = 0; continue;
                 * } map.put(j, tmp); j++; i = 0; cnt = 0;
                 */

                //System.out.println(Arrays.toString(tmp));
            }
        }
        System.out.println("while문 끝");
        System.out.println(Arrays.toString(map.get(0)));
        map.keySet().forEach(d ->{
            System.out.println(Arrays.toString(map.get(d)));
        });



        /*
         * int cnt = 0;
         *
         * for(int i = 0; i < tmp.length; i++) {
         *
         * if(cnt != 3) { //System.out.println((int)(Math.random() * nums.length)); int
         * ran = (int)(Math.random() * nums.length); tmp[i] = nums[ran];
         *
         * cnt += 1; System.out.println(cnt); if(cnt == 3) { i = 0; continue; } } else {
         * //System.out.println(Arrays.toString(tmp));
         *
         * Arrays.sort(tmp); System.out.println(Arrays.toString(tmp));
         *
         * if(i == 0) { map.put(i, tmp); reset(tmp); cnt = 0; i = 0; } else {
         * if(Arrays.equals(map.get(i-1), map.get(i))) { reset(tmp); cnt = 0; i = 0;
         * continue; } else { map.put(i, tmp); reset(tmp); cnt = 0; i = 0; } }
         *
         * } }
         */

//		map.keySet().forEach(s -> {
//			System.out.println(Arrays.toString(map.get(s)));
//		});
        return 0;
    }
    static void reset(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
    
}