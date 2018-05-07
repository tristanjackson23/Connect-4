package game;

public class C4Board {
	private Cell[][] board;
	private int Rows;
	private int Cols;
	
	public C4Board(int aRows, int aCols) {
		board = new Cell[aRows, aCols];
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
		for (int i = 0; i < self.board.length; i++) { 
			for (int j = 0; j < board[i].length; j++) { 
				System.out.print(board[i][j] + ' '); 
			}
			System.out.print("/n");
		}
	}
}
