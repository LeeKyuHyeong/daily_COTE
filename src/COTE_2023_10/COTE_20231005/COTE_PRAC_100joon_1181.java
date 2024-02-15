package COTE_2023_10.COTE_20231005;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class COTE_PRAC_100joon_1181 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 숫자 입력받기
        int n = Integer.parseInt(bf.readLine());

        String[] x = new String[n];

        for (int i = 0; i < n; i++) {
            x[i] = (bf.readLine());
        }
        
        // sort 로 배열 재정의
//        Arrays.sort(x, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                if (o1.length() == o2.length()){
//                	return o1.compareTo(o2);
//                }else {
//                	return o1.length() - o2.length();
//                }
//            }
//        });

        Arrays.sort(x, new Comparator<String>() {
        	@Override
        	public int compare(String o1, String o2) {
        		// TODO Auto-generated method stub
        		if(o1.length() == o2.length()) {
        			return o2.compareTo(o1);
        		} else {
        			return o1.length() - o2.length();
        		}
        	}
		});
        
        bw.write(String.valueOf(x[0]) + " ");
        bw.write("\n");
        
        // 출력
        for (int i = 1; i < x.length; i++) {
            if (!x[i].equals(x[i-1])) {
                bw.write(String.valueOf(x[i]) + " ");
                bw.write("\n");
            }
        }
        bw.flush();
        bw.close();
    }
		
}
