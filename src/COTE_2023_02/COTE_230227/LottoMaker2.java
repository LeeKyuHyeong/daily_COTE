package COTE_2023_02.COTE_230227;

public class LottoMaker2 {

	public static void main(String[] args) {
		
		
		int jo = (int)(Math.random() * 5) + 1;
		
		System.out.print(jo + "조 : ");
		for(int i = 0; i < 6; i++) {
			System.out.print(((int)(Math.random() * 10 + 1) - 1) + "\t");
		}
		System.out.println();
			
		
	
		
	}

}
