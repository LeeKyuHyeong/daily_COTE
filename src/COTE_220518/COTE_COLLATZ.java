package COTE_220518;

public class COTE_COLLATZ {
	public static void main(String[] args) {
		
		long num = 626331;
		int cnt = 0;

		while(num != 1) {
			num = num%2 == 0 ? num/2 : (num*3)+1;
			cnt++;
			if(cnt > 500) {
				cnt = -1;
				break;
			}
			continue;
		}
		System.out.println(num);
		System.out.println(cnt);
		
	}
}
