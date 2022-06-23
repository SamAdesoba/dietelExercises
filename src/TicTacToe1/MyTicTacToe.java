package TicTacToe1;

import static TicTacToe1.BoardElement.*;

public class MyTicTacToe {
	Board1 board1 = new Board1();

	public BoardElement getBoardPosition(int row, int column) {
		return board1.getPosition(row, column);
	}
}
