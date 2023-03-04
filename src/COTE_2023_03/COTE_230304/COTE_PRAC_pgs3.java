package COTE_2023_03.COTE_230304;

import java.util.Arrays;

class COTE_PRAC_pgs3 {

	public static void main(String[] args){

//		int[][] board = {
//				 {1, 0, 0, 0, 0}
//			   , {0, 0, 0, 0, 0}
//			   , {0, 0, 0, 0, 0}
//			   , {0, 0, 0, 0, 0}
//			   , {0, 0, 0, 0, 1}
//					   };
		int[][] board = {
				{1, 0, 0}
				, {0, 0, 1}
				, {0, 0, 0}
		};
		int answer = 0;
		
		int[][] copyBoard = new int[board.length + 2][board[0].length + 2];
		for(int i = 0; i < copyBoard.length; i++) {
			
			for(int j = 0; j < copyBoard[i].length; j++) {
				
				copyBoard[i][j] = 0;
				
			}
		}
		for(int i = 0; i < board.length; i++) {
			
			for(int j = 0; j < board[i].length; j++) {
				
				if(board[i][j] == 1) {
					copyBoard[i+1][j+1] = board[i][j];
					
					copyBoard[i][j] = copyBoard[i][j] == 1 ? 1 : 2; 
					copyBoard[i+1][j] = copyBoard[i+1][j] == 1 ? 1 : 2;
					copyBoard[i][j+2] = copyBoard[i][j+2] == 1 ? 1 : 2;
					copyBoard[i+2][j] = copyBoard[i+2][j] == 1 ? 1 : 2; 
					copyBoard[i+2][j+1] = copyBoard[i+2][j+1] == 1 ? 1 : 2; 
					copyBoard[i][j+1] = copyBoard[i][j+1] == 1 ? 1 : 2; 
					copyBoard[i+1][j+2] = copyBoard[i+1][j+2] == 1 ? 1 : 2; 
					copyBoard[i+2][j+2] = copyBoard[i+2][j+2] == 1 ? 1 : 2; 
				}
				
			}
		}
		
	
		for(int i = 1; i < copyBoard.length-1; i++) {
			
			for(int j = 1; j < copyBoard[i].length-1; j++) {
				
				if(copyBoard[i][j] == 0) {
					answer++;
				}
				
			}
		}
		System.out.println(answer);
	}

}
