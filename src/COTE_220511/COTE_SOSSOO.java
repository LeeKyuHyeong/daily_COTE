package COTE_220511;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class COTE_SOSSOO {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4};

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
	}
	static void reset(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
