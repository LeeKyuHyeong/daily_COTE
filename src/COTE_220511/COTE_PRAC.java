package COTE_220511;

import java.util.TreeSet;

public class COTE_PRAC {
	public static void main(String[] args) {
		//로또번호 생성
		TreeSet<Integer> lottos = new TreeSet<Integer>();
		int num[] = new int[45];
		
		for(int i = 0; i < num.length; i++) {
			num[i] = i+1;
		}
		for(int j = 0; j < 45; j++) {
			int tmp = 0;
			int ran = (int)(Math.random() * 45);
			tmp = num[j];
			num[j] = num[ran];
			num[ran] = tmp;
		}
		for(int i = 0; i < 6; i++) {
			lottos.add(num[i]);
		}
		
		System.out.println(lottos);
	}
}
