package TicTacToe;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static TicTacToe.Elements.*;
import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTest {
	private TicTacToe ticTacToe;

	@BeforeEach
	public void setUp(){
		ticTacToe = new TicTacToe();
	}

	@Test
	public void ticTacToeCanBeCreatedTest(){
		assertNotNull(ticTacToe);
	}

	@Test
	public void boardIsEmptyByDefaultTest() {
		ticTacToe.position(0,0);
		assertEquals(E, ticTacToe.getPosition(0,0));
	}

	@Test
	public void ticTacToePlayXTest() {
		ticTacToe.playAt(0,0);
		assertEquals(X, ticTacToe.getPosition(0,0));

	}

	@Test
	public void ticTacToePlayCannotBeOverrideTest() {
		ticTacToe.playAt(0,0);
		ticTacToe.playAt(0,0);
		assertEquals(X, ticTacToe.getPosition(0,0));
	}


}
