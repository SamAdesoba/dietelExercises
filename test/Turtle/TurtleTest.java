package Turtle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static Turtle.Direction.*;
import static org.testng.AssertJUnit.*;

public class TurtleTest {
	private Turtle turtle;
	private SketchPad sketchPad;

	@BeforeEach
	public void setup(){
		turtle = new Turtle();
		sketchPad = new SketchPad(5,5);
	}
	@Test
	public void turtleExistsTest(){
		assertNotNull(turtle);
	}

	@Test
	public void turtlePenIsUpByDefaultTest(){
		turtle.isPenDown();
		assertFalse(turtle.isPenDown());
	}

	@Test
	public void turtlePenMoveDownTest(){
		turtle.isPenUp();
		assertTrue(turtle.isPenUp());
		turtle.penDown();
		assertTrue(turtle.isPenDown());
	}

	@Test
	public void turtlePenMoveUpWhenDownTest(){
		turtle.penDown();
		assertTrue(turtle.isPenDown());
		turtle.penUp();
		assertFalse(turtle.isPenDown());
	}

	@Test
	public void turtlePositionIsEastByDefaultTest(){
		assertSame(EAST, turtle.getCurrentDirection());
	}

	@Test
	public void turtleCanMoveRightFromEastTest(){
		turtle.turnRight();
		assertSame(SOUTH, turtle.getCurrentDirection());
	}

	@Test
	public void turtleCanMoveRightFromSouthTest(){
		turtle.turnRight();
		turtle.turnRight();
		assertSame(WEST, turtle.getCurrentDirection());
	}

	@Test
	public void turtleCanMoveRightFromWestTest(){
		turtle.turnRight();
		turtle.turnRight();
		turtle.turnRight();
		assertSame(NORTH, turtle.getCurrentDirection());
	}

	@Test
	public void turtleCanMoveRightFromNorthTest(){
		turtle.turnRight();
		turtle.turnRight();
		turtle.turnRight();
		turtle.turnRight();
		assertSame(EAST, turtle.getCurrentDirection());
	}

	@Test
	public void turtlePositionIsFacingEastTest(){
		assertSame(EAST, turtle.getCurrentDirection());
	}

	@Test
	public void turtleCanMoveLeftFromEastTest(){
		turtle.turnLeft();
		assertSame(Direction.NORTH, turtle.getCurrentDirection());
	}

	@Test
	public void turtleCanMoveLeftFromNorthTest(){
		turtle.turnLeft();
		turtle.turnLeft();
		assertSame(WEST, turtle.getCurrentDirection());
	}

	@Test
	public void turtleCanMoveLeftFromWestTest(){
		turtle.turnLeft();
		turtle.turnLeft();
		turtle.turnLeft();
		assertSame(SOUTH, turtle.getCurrentDirection());
	}

	@Test
	public void turtleCanMoveLeftFromSouthTest(){
		turtle.turnLeft();
		turtle.turnLeft();
		turtle.turnLeft();
		turtle.turnLeft();
		assertSame(EAST, turtle.getCurrentDirection());
	}

	@Test
	public void turtleCanMoveForwardFacingEastTest(){
		turtle.move(3, sketchPad);
		assertEquals(new Position(0,2), turtle.getCurrentPosition());
		turtle.move(2, sketchPad);
		assertEquals(new Position(0,3), turtle.getCurrentPosition());
	}

	@Test
	public void turtleCanMoveForwardFacingSouthTest(){
		turtle.turnRight();
		turtle.move(3, sketchPad);
		assertEquals(new Position(2,0), turtle.getCurrentPosition());
		turtle.move(2, sketchPad);
		assertEquals(new Position(3,0), turtle.getCurrentPosition());
	}

	@Test
	public void turtleCanMoveFacingEast_ThenMoveFacingSouthTest(){
		turtle.move(3, sketchPad);
		assertEquals(new Position(0,2), turtle.getCurrentPosition());
		turtle.turnRight();
		turtle.move(2, sketchPad);
		assertEquals(new Position(1,2), turtle.getCurrentPosition());
	}

	@Test
	public void turtleCanMoveFacingEast_ThenMoveFacingWestTest(){
		turtle.move(4, sketchPad);
		assertEquals(new Position(0,3), turtle.getCurrentPosition());
		turtle.turnRight();
		turtle.turnRight();
		turtle.move(2, sketchPad);
		assertEquals(new Position(0,2), turtle.getCurrentPosition());
	}

	@Test
	public void turtleCanMoveFacingEast_moveFacingSouth_ThenMoveFacingWestTest(){
		turtle.move(4, sketchPad);
		assertEquals(new Position(0,3), turtle.getCurrentPosition());
		turtle.turnRight();
		turtle.move(2, sketchPad);
		assertEquals(new Position(1,3), turtle.getCurrentPosition());
		turtle.turnRight();
		turtle.move(2, sketchPad);
		assertEquals(new Position(1,2), turtle.getCurrentPosition());
	}

	@Test
	public void turtleCanMoveForwardFacingNorthTest(){
		turtle.turnRight();
		turtle.move(3, sketchPad);
		assertEquals(new Position(2,0), turtle.getCurrentPosition());
		turtle.turnLeft();
		turtle.turnLeft();
		turtle.move(2, sketchPad);
		assertEquals(new Position(1,0), turtle.getCurrentPosition());
	}

	@Test
	public void whenPenIsDDown_turtleWritesFacingEastTest(){
		turtle.penDown();
		turtle.move(5, sketchPad);
		String expected = "* * * * * \n          \n          \n          \n          \n";
		assertEquals(expected, sketchPad.toString());
		assertEquals(new Position(0,4), turtle.getCurrentPosition());
	}

	@Test
	public void whenPenIsDDown_turtleWritesFacingSouthTest(){
		turtle.turnRight();
		turtle.penDown();
		turtle.move(5, sketchPad);
		String expected = "*         \n*         \n*         \n*         \n*         \n";
		assertEquals(expected, sketchPad.toString());
		assertEquals(new Position(4,0), turtle.getCurrentPosition());
	}

	@Test
	public void whenPenIsDDown_turtleWritesFacingEast_AndThenSouthTest(){
		turtle.penDown();
		turtle.move(5, sketchPad);
		turtle.turnRight();
		turtle.move(5, sketchPad);
		String expected = "* * * * * \n        * \n        * \n        * \n        * \n";
		assertEquals(expected, sketchPad.toString());
		assertEquals(new Position(4,4), turtle.getCurrentPosition());
	}

	@Test
	public void whenPenIsDDown_turtleWritesFacingEast_South_AndThenWestTest(){
		turtle.penDown();
		turtle.move(5, sketchPad);
		turtle.turnRight();
		turtle.move(5, sketchPad);
		turtle.turnRight();
		turtle.move(5, sketchPad);
		String expected = "* * * * * \n        * \n        * \n        * \n* * * * * \n";
		assertEquals(expected, sketchPad.toString());
		assertEquals(new Position(4,0), turtle.getCurrentPosition());
	}

	@Test
	public void whenPenIsDDown_turtleWritesFacingEast_South_West_AndThenNorthTest(){
		turtle.penDown();
		turtle.move(5, sketchPad);
		turtle.turnRight();
		turtle.move(5, sketchPad);
		turtle.turnRight();
		turtle.move(5, sketchPad);
		turtle.turnRight();
		turtle.move(5, sketchPad);
		String expected = "* * * * * \n*       * \n*       * \n*       * \n* * * * * \n";
		assertEquals(expected, sketchPad.toString());
		assertEquals(new Position(0,0), turtle.getCurrentPosition());
	}

	@Test
	public void whenPenIsDDown_turtleWritesThreeTest(){
		turtle.penDown();
		turtle.move(5, sketchPad);
		turtle.turnRight();
		turtle.move(2, sketchPad);
		turtle.penUp();
		turtle.move(2, sketchPad);
		turtle.turnRight();
		turtle.move(5, sketchPad);
		turtle.turnRight();
		turtle.turnRight();
		turtle.penDown();
		turtle.move(5, sketchPad);
		turtle.turnRight();
		turtle.move(3, sketchPad);
		turtle.turnRight();
		turtle.move(5, sketchPad);
		System.out.println(sketchPad.toString());
	}
}