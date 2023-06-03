package baekjoon.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class bj_11005 {
	
	public static void main(String[] args) throws IOException { //BufferedReader, BufferedWriter 쓰기위한 예외처리
		
		// 입력받을 br 객체 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 출력할 bw 객체 생성
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 입력받은 한 줄 input 변수에 대입
		String input = br.readLine();
		
		// 입력받은 input 10진법 수 num과 진법 arith 변수 생성
		int num = Integer.parseInt(input.split(" ")[0]);
		int arith = Integer.parseInt(input.split(" ")[1]);
		
		// 10 이상의 수들을 char로 표현하기 위한 map 참조객체 생성
		Map<Integer, Character> map = new HashMap<>();
		if(arith > 10) {
			for(int i = 10; i < arith; i++) {
				map.put(i, (char)(55+i));
			}
		}
		
		// 몇 자리 수로 변환 될건지 부터 확인
		int cnt = 0;
		for(int i = 0; i < 100000; i++) {
			if(num < Math.pow(arith, i)) {
				cnt = i;
				System.out.println(cnt);
				break;
			}
		}
		
		// 정답을 담을 문자열 변수 초기화 및 생성
		String answer = "";
		
		// 진법 변환 시작
		for(int i = 0; i < cnt; i++) {
			// 주어진 수를 나눈 몫이 변환된 문자열의 각 자리다
			int tmp = (int) (num / (Math.pow(arith, (cnt-i-1) ) ) );
			
			System.out.println("tmp : " + tmp);
			
			if(tmp < 10) {
				// 나눈 몫이 10보다 작으면 그대로 숫자를 합쳐주고
				answer += tmp;	
			} else {
				// 10보다 크면 진법표현식으로 바꿔준다
				answer += map.get(tmp);
			}
			System.out.println("answer : " + answer);
			// 차수를 한개씩 낮추며 num을 조절해준다
			num -= ((int)Math.pow(arith,(cnt-i-1)) * tmp);
			
			System.out.println("num : " + num);
			
			System.out.println();
		}
		
		// answer 출력 
		bw.write(answer); 
		// 다 쓴 자원들은 닫아주고 끝
		br.close();
		bw.flush(); 
		bw.close();
		 
	}
	
}
