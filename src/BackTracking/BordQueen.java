package BackTracking;

import Recursion.Permution;

public class BordQueen {
	public static void main(String[] args) {
		int n=4;
		boolean[] board=new boolean[n];
		int tq=2;
		Permution(board, tq, "", 0);
	}

	private static void Permution(boolean[] board, int tq, String ans, int qpsf) {
		
		// TODO Auto-generated method stub
		if(qpsf==tq) {
			System.out.println(ans);
			return;
		}
		
		for(int i=0; i<board.length; i++) {
			if(!board[i]) {
				board[i]=true;
				Permution(board, tq,ans+"b"+i+"q",qpsf+1);
				board[i]=false;
			}
		}
	}
}
