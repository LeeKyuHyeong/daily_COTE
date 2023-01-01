package COTE_221231;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class COTE_PRAC_100joon {

	public static void main(String[] args) throws IOException {
		//입출력을 맡을 BufferedReader와 BufferedWriter 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// 격자 크기
		int arrLength = 9;
		
		// 최대값을 담을 변수 생성 및 초기화
		int MAX = 0;
		// 최대값일때의 위치를 파악하기 위한 변수 생성 및 초기화
		int x = 0;
		int y = 0;
		// while문 제어 변수 생성 및 초기화
		int line = 0;
		int tmp = 0;
		
		while(tmp < arrLength) {
			//입력받은 한 줄 담을 문자열 생성 및 대입
			String s = br.readLine();
			//반복문을 돌며 최대값일때 마다 MAX에 대입
			for(int i = 0; i < arrLength; i++) {
				//MAX에 들어있는 수 보다 입력받은 수가 더 클때 MAX에 그 값 대입
				if(MAX < Integer.parseInt(s.split(" ")[i])) {
					MAX = Integer.parseInt(s.split(" ")[i]);
					//MAX에 들어있는 수 보다 입력받은 수가 더 클때 x, y에 배열 위치 대입
					x = line;
					y = i;
				}				
				
			}
			//for문 한바퀴 실행 후 다음 라인으로 가기위한 작업 및 while 제어 변수 변경
			line++;
			tmp++;
		}
		//여기서 틀렸었다 bw.write에선 x+1라고하니 01로 나왔다 괄호를 씌워주니 통과
		bw.write(MAX + "\n" + (x+1) + " " + (y+1));
		bw.flush();
		bw.close();
	}

}
