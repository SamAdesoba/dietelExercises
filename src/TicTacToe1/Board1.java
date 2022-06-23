package TicTacToe1;

import static TicTacToe1.BoardElement.*;

public class Board1 {
	private static int row;
	private static int column;
	BoardElement[][] elements = new BoardElement[3][3];

	public Board1() {
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements[i].length; j++) {
				elements[i][j] = E;
			}
		}
	}

	public void setElements(int row, int column, BoardElement element){
		elements[row][column] = element;
	}
	public BoardElement getPosition(int row, int column) {
		return elements[row][column];
	}

	private static int position(int row, int column) {
		return 0;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}
}
