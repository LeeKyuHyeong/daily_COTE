package COTE_221230;

public class COTE_PRAC_pgs {

	public static void main(String[] args) {
		
		int num = 6;
		int total = 15;
		int midVal = total / num;
		int midArr = (num % 2 == 0) ? (num / 2) - 1 : num / 2;
		
		int[] numArr = new int[num];
				
    	int tmpVal = midVal;
    	
    	numArr[midArr] = midVal;
    	
    	for(int i = midArr-1; i >= 0; i--) {
			numArr[i] = --tmpVal;
		}
		tmpVal = midVal;
		
		for(int j = midArr+1; j < num; j++) {
			numArr[j] = ++tmpVal;
		}
        	
        
		
		for(int arr : numArr) {
			System.out.println(arr);
		}

	}

}
