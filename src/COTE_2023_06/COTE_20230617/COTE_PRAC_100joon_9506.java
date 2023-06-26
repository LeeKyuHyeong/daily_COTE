package COTE_2023_06.COTE_20230617;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class COTE_PRAC_100joon_9506 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		
		Map<Integer, String> map = new HashMap<>();

		int tmp = 1;
		
		while(flag) {
			
			int n = sc.nextInt();
			
			if(n == -1) {
				flag = false;
				break;
			}
			
			map.put(tmp, perfect(n));
			
			tmp++;
		}

		for(int i = 1; i <= map.size(); i++) {
			System.out.println(map.get(i));
		}
		sc.close();
	}
	
	static String perfect(int n) {
		
		String result = n + " ";
		
		int sum = 1;
		
		String perfStr = "= 1";
		String notPerfStr = "is NOT perfect.";
		
		for(int i = 2; i <= n / 2; i++) {
			if(n % i == 0) {
				System.out.println("i : " + i);
				sum += i;
				perfStr += " + " + i;
			}
		}
		
		result += sum == n ? perfStr : notPerfStr;
		
		return result;
	}
	
	
	
}
