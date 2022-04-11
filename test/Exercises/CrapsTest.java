package Exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CrapsTest {
	private Craps random;

	@BeforeEach
	public void startUp(){
		random = new Craps();

	}

	@Test
	public void firstRandomNumberTest(){
		random.firstRandomNumber(6);
		assertEquals(3,random.getFirstRandomNumber());
	}

	@Test
	public void secondRandomNumberTest(){
		random.secondRandomNumber(6);
		assertEquals(4,random.getSecondRandomNumber());
	}

	@Test
	public void sumTest(){
		random.sum(3,4);
		assertEquals(7,random.getSum());
	}

	@Test
	public void winTest(){
		random.firstRandomNumber(6);
		random.secondRandomNumber(6);
		random.sum(3,4);
		assertEquals(7, random.getWinResponse());
		random.sum(5,6);
		assertEquals(11, random.getWinResponse());
	}

	@Test
	public void loseTest(){
		random.firstRandomNumber(6);
		random.secondRandomNumber(6);
		random.sum(1,1);
		assertEquals(2, random.getLoseResponse());
		random.sum(1,2);
		assertEquals(3, random.getLoseResponse());
		random.sum(6,6);
		assertEquals(2, random.getLoseResponse());

	}
}
