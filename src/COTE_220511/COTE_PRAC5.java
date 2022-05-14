package COTE_220511;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class COTE_PRAC5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자입력 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
