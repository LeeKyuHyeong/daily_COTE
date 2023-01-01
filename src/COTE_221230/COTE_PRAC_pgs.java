package COTE_221230;

public class COTE_PRAC_pgs {

	public static void main(String[] args) {
		
		int num = 6;
		int total = 15;
		int midVal = total / num;
		//입력받은 수가 홀수인지 짝수인지 판별 후 중간값 지정
		int midArr = (num % 2 == 0) ? (num / 2) - 1 : num / 2;
        
        int[] answer = new int[num];
        
        //기준값인 midVal은 변하면 안되기때문에 임시값에 대입하여 임시기준값을 사용
        int tmpVal = midVal;
        
        //기준값을 기준배열번호에 대입
        answer[midArr] = midVal;

        //기준배열번호보다 아래의 배열들에 대입
        for(int i = midArr-1; i >= 0; i--) {
            answer[i] = --tmpVal;
        }
        //임시기준값을 초기화
        tmpVal = midVal;

        //기준배열번호보다 위의 배열들에 대입
        for(int j = midArr+1; j < num; j++) {
            answer[j] = ++tmpVal;
        }

		for(int arr : answer) {
			System.out.println(arr);
		}

	}

}
