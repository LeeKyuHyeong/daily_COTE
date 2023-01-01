package COTE_221230;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class COTE_PRAC_100joon {
    public static void main(String[] args) throws IOException {
        
        //입출력을 위한 BufferedReader, BufferedWriter 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        //2차 배열 크기 정하는 첫 줄 입력받기
		String s = br.readLine();
        
        //첫줄을 띄워쓰기 기준으로 split한 행과 열을 x, y에 나눠 대입해둠
        int x = Integer.parseInt(s.split(" ")[0]);
		int y = Integer.parseInt(s.split(" ")[1]);
        
        //합칠 2차배열 두개 생성
        int[][] intArr1 = new int[x][y];
		int[][] intArr2 = new int[x][y];
        
        //while문 빠져나올 tmp값 초기화 및 입력받을때 배열을 다음줄로 넘길 i값 초기화
        int tmp = 0;
		int i = 0;
        
        // 첫 배열생성 위한 첫번째 while문
	    while(tmp < x) {
	        //while문 안에서 입력받기
		    String input = br.readLine();
		    
	    	for(int j = 0; j < intArr1[i].length; j++) { 
	    		//한 줄 입력시 띄워쓰기 기준으로 배열에 대입됨
	    		intArr1[i][j] = Integer.parseInt(input.split(" ")[j]); 
	    		
    		}
	    	//한 줄 입력완료되면 다음줄로 가기위한 i, x값과 같게되면 while 나가기위한 tmp 올리기
		    i++;
		    tmp++; 
	    }
	    
        //두번째 배열을 만들기위한 tmp 및 i 재초기화
	    tmp = 0;
	    i = 0;
        
        // 두번째 배열생성 위한 두번째 while문
	    while(tmp < x) {
	    	
	    	String input = br.readLine();
	    	
	    	for(int j = 0; j < intArr1[i].length; j++) { 
	    		
	    		intArr2[i][j] = Integer.parseInt(input.split(" ")[j]); 
	    		
	    	}
	    	
	    	i++;
	    	tmp++; 
	    }
		 
		int[][] answer = new int[x][y];
		
		for(int k = 0; k < answer.length; k++) {
			
			for(int l = 0; l < answer[k].length; l++) {
				
				answer[k][l] = intArr1[k][l] + intArr2[k][l];
                //BufferedWriter는 int값을 못 출력하는것같다 String으로 바꿔 출력
				bw.write(String.valueOf(answer[k][l]) + " ");
			}
			bw.write("\n");
		}
        
		bw.flush();
		bw.close();
    }
}