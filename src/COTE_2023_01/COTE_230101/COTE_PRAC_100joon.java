package COTE_2023_01.COTE_230101;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class COTE_PRAC_100joon {
	//색종이 크기구하기
	public static void main(String[] args) throws IOException{
		//입출력을 맡을 BufferedReader와 BufferedWriter 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// 도화지 크기를 110이라고 가정하고 시작
		int[][] intArr = new int[110][110];
		// 색종이 개수 받아올 변수 생성 및 입력값 대입
		String inputNum = br.readLine();
		int paperNum = Integer.parseInt(inputNum);
		// while 제어 변수 생성 및 초기화
		int tmp = 0;
		// 색종이 개수 만큼 while반복을 돌림
		while(tmp < paperNum) {
			// 도화지에 찍힐 좌표 변수 생성 및 초기화
			int x = 0;
			int y = 0;
			// 각 색종이 시작 좌표 입력값을 int로 바꿔 x, y에 대입
			String s = br.readLine();
			
			x = Integer.parseInt(s.split(" ")[0]);
			y = Integer.parseInt(s.split(" ")[1]);
			// 좌표의 시작부터 10커질때까지 그 좌표의 값에 1을 더함
			for(int i = x; i < x + 10; i++) {
				for(int j = y; j < y + 10; j++) {
					intArr[i][j]++;
				}
			}
			// for문 한번 실행완료 후 tmp값을 올려줘 while문을 제어
			tmp++;
		}
		// 출력할 크기 변수 생성 및 초기화
		int answer = 0;
		
		// 110으로 만든 배열을 100까지만 반복하여 도화지크기 100을 넘지 않게 한 후
		// 그 좌표의 값이 0이 아닐때만 (겹치면 2이상 값이 찍히겠지만 크기 값에는 한번만 들어감) 크기 값에 1을 더함
		for(int i = 0; i < 100; i++) {
			for(int j = 0; j < 100; j++) {
				if(intArr[i][j] != 0) {
					answer++;
				}
			}
		}
		// 크기 값 출력
		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
		
	}

}
