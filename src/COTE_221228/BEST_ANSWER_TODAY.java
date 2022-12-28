package COTE_221228;

public class BEST_ANSWER_TODAY {
	public static void main(String[] args) {
		int answer = 0;
		String[] babbling = {"aya", "etc.."};
		
		for(int i = 0; i < babbling.length; i++) {
			if(babbling[i].matches("^(aya(?!aya)|ye(?!ye)|woo(?!woo)|ma(?!ma))+$")) {
				answer++;
			}
		}
	}
}
