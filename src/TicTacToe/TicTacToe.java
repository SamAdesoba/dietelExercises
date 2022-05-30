package TicTacToe;

import static TicTacToe.Elements.*;

public class TicTacToe {
	Board board = new Board();
	private int move;
	private boolean player1;
	private boolean player2;
	public void position(int row, int column) {

	}


	public Elements getPosition(int row, int column) {
		return board.getPosition(row, column);
	}


	public void playAt(int row, int column) {
		if (board.getPosition(row, column) == E){
		board.setElements(row, column,changePlayer());
		move++;
		} //throw new IllegalArgumentException("Player 1 should play first");
	}

	public Elements changePlayer(){
		if(move % 2 == 0) return X;
		if(move % 2 == 1) return O;
		return E;
	}

	public String display(){
		return board.toString();
	}

//	public String getPlayer() {
//		if(move % 2 == 0) currentPlayer = player1;
//		if(move % 2 == 1) currentPlayer = player1;
//	}

	public String getPlayer() {
		if(isFirstPlayer()) return "Player 1 (X) turn";
		return "Player 2 (O) turn";
	}

	public boolean isFirstPlayer() {
		return move % 2 == 0;
	}
	public boolean isDraw(){
		return move == 9;
	}

	public boolean player1Won(){
		win();
		return player1;
	}
	public boolean player2Won(){
		win();
		return player2;
	}

	public void win(){
		row1win();
		row2win();
		row3win();
		column1win();
		column2win();
		column3win();
		diagonal1win();
		diagonal2win();
	}

	private void diagonal2win() {
		if(thirdElement() == X && fifthElement() == X && seventhElement() == X) {player1 = true;
		}else if(thirdElement() == O && fifthElement() == O && seventhElement() == O) player2 = true;
	}

	private void diagonal1win() {
		if(firstElement() == X && fifthElement() == X && ninthElement() == X) {player1 = true;
		}else if(fifthElement() == O && fifthElement() == O && ninthElement() == O) player2 = true;
	}

	private void column3win() {
		if(thirdElement() == X && sixthElement() == X && ninthElement() == X) {player1 = true;
		}else if(thirdElement() == O && sixthElement() == O && ninthElement() == O) player2 = true;
	}

	private void column2win() {
		if(secondElement() == X && fifthElement() == X && eightElement() == X) {player1 = true;
		}else if(secondElement() == O && fifthElement() == O && eightElement() == O) player2 = true;
	}

	private void column1win() {
		if(firstElement() == X && forthElement() == X && secondElement() == X) {player1 = true;
		}else if(firstElement() == O && forthElement() == O && seventhElement() == O) player2 = true;
	}

	private void row3win() {
		if(seventhElement() == X && eightElement() == X && ninthElement() == X) {player1 = true;
		}else if(seventhElement() == O && eightElement() == O && ninthElement() == O) player2 = true;
	}

	private void row2win() {
		if(forthElement() == X && fifthElement() == X && sixthElement() == X) {player1 = true;
		}else if(forthElement() == O && fifthElement() == O && sixthElement() == O) player2 = true;
	}

	private void row1win() {
		if(firstElement() == X && secondElement() == X && thirdElement() == X) {player1 = true;
		}else if(firstElement() == O && secondElement() == O && thirdElement() == O) player2 = true;
	}

	private Elements firstElement() {
		return board.getPosition(0,0);
	}

	private Elements secondElement() {
		return board.getPosition(0,1);
	}

	private Elements thirdElement() {
		return board.getPosition(0,2);
	}

	private Elements forthElement() {
		return board.getPosition(1,0);
	}

	private Elements fifthElement() {
		return board.getPosition(1,1);
	}

	private Elements sixthElement() {
		return board.getPosition(1,2);
	}

	private Elements seventhElement() {
		return board.getPosition(2,0);
	}

	private Elements eightElement() {
		return board.getPosition(2,1);
	}

	private Elements ninthElement() {
		return board.getPosition(2,2);
	}
}
