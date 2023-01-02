package COTE_2023_01.COTE_230101;

public class COTE_PRAC_pgs {

	public static void main(String[] args) {

		System.out.println(Solution("hello", "ohell"));
	}
	
	static int Solution(String A, String B) {
		// 입력받은 문자열을 문자배열에 넣음
		char[] chArr = A.toCharArray();
		// while문 제어 변수
		int tmp = 0;
		// 문자를 밀어서 바꾸는 횟수 변수
		int cycle = 0;
		// 밀어서 같은 문자열이 되거나 아예 매칭 안될때 까지 while문 반복
		while(tmp < chArr.length) {
            // 입력한 문자열 두개가 같다면 바로 0 리턴
            if(new String(chArr).equals(B)) {
				
                return cycle;
			}
            // for문을 통해 한칸씩 밀기
			for(int i = chArr.length-1; i > 0; i--) {
				char tmpCh = chArr[i];
				chArr[i] = chArr[i-1];
				chArr[i-1] = tmpCh;
			}
			// for문이 한번 실행 될때마다 밀어서 바꾸는 횟수 및 while 제어 변수 1 증가
			cycle++;
			tmp++;
		}
		// 몇번을 밀어도 같아질 수 없을 때 -1 리턴
		return -1;
	}
	
}
