package game;


public class Driver {

	public static void main(String[] args) {
		int ROWS=7;
		int COLS=6;
		
		Board board = new Board(ROWS, COLS);
		board.display();
	}

}
