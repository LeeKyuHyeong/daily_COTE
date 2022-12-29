package COTE_221229;

public class COTE_PRAC_prgs {

	public static void main(String[] args) {
		
		int[] arr2 = {1,2,3,4};
		int[] arr1 = {2,4,8};
		
		if((arr1[1] - arr1[0]) == (arr1[2] - arr1[1])) {
			System.out.println(arr1[arr1.length-1] + (arr1[1] - arr1[0]));
		} else {
			System.out.println(arr1[arr1.length-1] * (arr1[1] / arr1[0]));
		}
		

	}

}
