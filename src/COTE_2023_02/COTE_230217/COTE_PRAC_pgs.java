package COTE_2023_02.COTE_230217;

import java.util.Arrays;

class COTE_PRAC_pgs {
    public static void main(String[] args) {
        String before = "allpe";
        String after = "apple";

        char[] beforeArr = before.toCharArray();
        char[] afterArr = after.toCharArray();
        
        System.out.println(Arrays.toString(beforeArr));
        
        Arrays.sort(beforeArr);
        Arrays.sort(afterArr);
        
        System.out.println(Arrays.toString(beforeArr));
        System.out.println(Arrays.toString(afterArr));
        

        for(int i = 0; i < before.length(); i++) {
            sb.append("gunha");
        }
        System.out.println(sb.toString());
    }
}