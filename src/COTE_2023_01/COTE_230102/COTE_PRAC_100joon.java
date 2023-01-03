package COTE_2023_01.COTE_230102;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class COTE_PRAC_100joon {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String s = br.readLine();
        
        // 입력 받을 수의 개수 numLength
        int numLength = Integer.parseInt(s.split(" ")[0]);
        // 계산 진행할 횟수 calTimes
        int calTimes = Integer.parseInt(s.split(" ")[1]);
        
        // 기준이 될 numLength 만큼의 수 목록 받아오기
        String inputNums = br.readLine();
        
        int tmp = 0;
        // 계산 진행할 횟수 만큼 while문 반복
        while(tmp < calTimes) {
            // 정답 변수 생성 및 초기화(while문 새로 시작 할때 마다 0으로 초기화)
            int answer = 0;
            // 범위 입력받기
            String scopeStr = br.readLine();
            // 시작, 끝 범위 구분
            int start = Integer.parseInt(scopeStr.split(" ")[0]);
            int end = Integer.parseInt(scopeStr.split(" ")[1]);
            // 입력받은 두 숫자가 같으면 받은 번호의 배열숫자를 출력
            if(start == end) {
                answer = Integer.parseInt(inputNums.split(" ")[start-1]);
            } else {
                // 배열은 0부터 시작이니 start-1 부터 end까지 반복하며 answer에 증가시켜줌
                for(int i = start-1; i < end; i++) {
                    answer += Integer.parseInt(inputNums.split(" ")[i]);
                }    
            }
            
            bw.write(String.valueOf(answer) + "\n");
            tmp++;
        }
        bw.flush();
        bw.close();
    }

}
