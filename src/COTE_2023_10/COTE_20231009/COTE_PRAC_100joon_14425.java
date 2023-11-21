package COTE_2023_10.COTE_20231009;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;


public class COTE_PRAC_100joon_14425 {
	
	static String origin[];
	static String compare[];
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st1;
		StringTokenizer st2;
		
		String startStr = br.readLine();
		
		int N = Integer.parseInt(startStr.split(" ")[0]);
		
		int M = Integer.parseInt(startStr.split(" ")[1]);
		
		origin = new String[N];
		for(int i = 0; i < N; i++) {
			st1 = new StringTokenizer(br.readLine());
		}
		System.out.println();
		compare = new String[M-N];
		for(int j = N; j < M; j++) {
			st2 = new StringTokenizer(br.readLine());
		}
		
		Arrays.sort(origin, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
        for (int i = 0; i < M; i++) {
            String find = compare[i];

            if (result(find,(M-N))) System.out.print(1+" ");
            else System.out.print(0+" ");

        }
		
	}
	
	static boolean result(String find,int N){
        int left = 0;
        int right = N-1;

        while(left <= right){

            int midIndex = (right+left)/2;
            String mid = origin[midIndex];

            if(mid.compareTo(find) > 0){
                left = midIndex+1;
            }else if(mid.compareTo(find) <= 0){
                right = midIndex-1;
            }else if(find.equals(mid)){
                return true;
            }
        }
        return false;
    }
	
}
