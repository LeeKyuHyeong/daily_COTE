package COTE_2024_02;

import java.util.Scanner;

public class COTE_PRAC_100joon_1929 {
	
	public static boolean[] prime;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int start = sc.nextInt();
		
		int end = sc.nextInt();
		
		sosu(start, end);
		
		for(int i = 0; i < prime.length; i++) {
			if(!prime[i]) {
				System.out.println(i);
			}
		}
		
		
	}
	
	public static void sosu(int s, int e) {
		prime = new boolean[e - s + 1];
		
		if(s < 2 || e < 2) {
			return;
		}
		prime[0] = prime[1] = true;
		
		for(int i = s; i <= Math.sqrt(e); i++) {
			if(prime[i] == true) {
				continue;
			}
			for(int j = i * i; j < prime.length; j = j + i) {
				prime[j] = true;
			}
		}
		
		
	}
}
