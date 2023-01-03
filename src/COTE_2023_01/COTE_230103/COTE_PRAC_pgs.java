package COTE_2023_01.COTE_230103;

public class COTE_PRAC_pgs {

	public static void main(String[] args) {
		
		int[] array = {7, 17, 77};
		System.out.println("최종 : " + solution(array));
		
	}
	static int solution(int[] array) {
        int answer = 0;
        String tmpStr = "";
        
        for(int j = 0; j < array.length; j++) {
            tmpStr = String.valueOf(array[j]);
            int numLength = tmpStr.length();
            
            for(int i = 0; i < numLength; i++) {
                if(i == 0) {
                    if(array[j] / (int)Math.pow(10, numLength - 1 - i) == 7) {
                        ++answer;
                    }

                } else {
                    if(array[j] % (int)Math.pow(10, numLength - i) / (int)Math.pow(10, numLength - 1 - i) == 7) {
                        ++answer;
                    }
                }
            }
        }
        
        
        return answer;
    }
}
