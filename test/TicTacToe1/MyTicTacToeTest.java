package TicTacToe1;

import org.junit.jupiter.api.Test;

import static TicTacToe1.BoardElement.E;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MyTicTacToeTest {
	@Test
	public void TicTacToeCanBeCreatedTest(){
		MyTicTacToe TicTacToe1 = new MyTicTacToe();
		assertNotNull(TicTacToe1);
	}

	@Test
	public void boardCanBeCreated(){
		MyTicTacToe TicTacToe1 = new MyTicTacToe();
		TicTacToe1.getBoardPosition(0,0);
		assertEquals(E, TicTacToe1.getBoardPosition(0,0));
	}
}
