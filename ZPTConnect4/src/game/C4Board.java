package game;

public class C4Board {
	public C4Board() {
		int[][] board = new int[6][7];
		/*
		 * for (int i = 0; i < board.length; i++) { for (int j = 0; j <
		 * board[i].length; j++) { board[i][j] = 'n'; } }
		 */
	}

	public void deposit(int colour, int column, int[][] board) {/*need runtime exception for column full*/
		int lowest = 0;
		for (int i = board.length - 1; i >= 0; i--) {
			if (board[i][column] == 0) {
				lowest = i;
				break;
			}
		}
		board[lowest][column] = colour;
	}
	@Override
	public String toString(){
		for (int i = 0; i < C4Board.board.length; i++) { for (int j = 0; j < board[i].length; j++) { 
			board[i][j] = 'n'; }
		}
	}
}
