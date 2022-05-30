package TicTacToe;

import static TicTacToe.Elements.*;

public class Board {


	Elements[][] board = new Elements[3][3];

	public Board(){
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = E;
			}
		}
	}

	@Override
	public String toString() {
		return 	board[0][0]+ "  | " + board[0][1]+ " | " + board[0][2] +"\n"+
				  "-- "+"+"+"---"+"+"+" --"+ "\n"+
				  board[1][0]+ "  | " + board[1][1]+ " | " + board[1][2] +"\n"+
				  "-- "+"+"+"---"+"+"+" --"+ "\n"+
				  board[2][0]+ "  | " + board[2][1]+ " | " + board[2][2] ;
	}

	public void setElements(int row, int column, Elements element) {
		board[row][column] = element;
	}

	public Elements getPosition(int row, int column) {
		return board[row][column];
	}
}
