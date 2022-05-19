package COTE_220519;

public class COTE_ODD_EVEN {
	public static void main(String[] args) {
		
		int num = -3;
		
		if(num < 0) {
			num = -num;
		}
		
		String answer = num % 2 == 1 ? "Odd" : "Even";
		
		System.out.println(answer);
	}
}
