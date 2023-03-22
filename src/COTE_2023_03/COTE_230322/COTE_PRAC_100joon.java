package COTE_2023_03.COTE_230322;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class COTE_PRAC_100joon {

	// 10810 번  공 넣기
	//BufferedReader 와 writer 를 쓰기위한 예외처리
	public static void main(String[] args) throws IOException {
		
		// 입력 받을 참조변수 br 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 출력 하기 위한 참조변수 br 생성
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// 마지막에 출력할 문자열
		String answer = "";
		
		//첫째 줄에 N번 바구니 M개의 줄
		String input = br.readLine();
		
		// 총 바구니 개수
		int basket = Integer.parseInt(input.split(" ")[0]);
		
		// 공 넣기 반복
		int cnt = Integer.parseInt(input.split(" ")[1]);
		
		//while문 조절 변수 생성
		int tmp = 0;
		
		// 총 바구니 개수가 길이인 int형 배열 생성
		int[] baskets = new int[basket];
		// 0으로 초기화
		for(int i = 0; i < baskets.length; i++) {
			baskets[i] = 0;
		}
		
		//cnt만큼 반복
		while(tmp < cnt) {
			
			// while 문 안에서 입력받기
			String inputWhile = br.readLine();
			
			// 바꿀 시작 바구니번호
			int start = Integer.parseInt(inputWhile.split(" ")[0]);
			
			// 바꿀 마지막 바구니번호
			int end = Integer.parseInt(inputWhile.split(" ")[1]);
			
			
			//tmp를 1 증가 시키면서 반복
			tmp++;
		}
		
		for(int j : baskets) {
			answer += j + " ";
		}
		
		bw.write(answer);
		bw.flush();
		bw.close();
		
	}

}
