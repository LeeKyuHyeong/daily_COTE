package COTE_2023_01.COTE_230103;

import java.util.Arrays;
import java.util.Scanner;

public class COTE_PRAC_100joon {

	public static void main(String[] args) {
		// 입력받을 스캐너 클래스 참조값 생성
        Scanner sc = new Scanner(System.in);
        // 입력받은 숫자 넣을 배열 생성
        int[] intArr = new int[5];
        // while 제어 숫자 변수
        int i = 0;
        // 총합 담을 숫자 변수
        int sum = 0;
        // 5개의 자연수를 받기위한 while문 5번반복
        while(i < intArr.length) {
            // 입력한 수 배열에 대입
            intArr[i] = sc.nextInt();
            // 입력한 수 총합에 추가
            sum += intArr[i];
            // while문 제어 숫자 증가
            i++;
        }
        // 배열 정렬
        Arrays.sort(intArr);
        // 평균 출력
        System.out.println(sum / 5);
        // 중앙값 출력
        System.out.println(intArr[2]);
		
	}

}
