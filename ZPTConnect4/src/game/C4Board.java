package game;


public class C4Board {
	private C4Cell[][] board;
	private int rows;
	private int cols;

	public Board(int aRows, int aCols) {
	board = new C4Cell[aRows][aCols];
	rows = aRows;
	cols = aCols;
	for (int i = 0; i < rows; i++) {
		for (int j = 0; j < cols; j++) {
			board[i][j] = new C4Cell(); 
		}
	}
	}
}