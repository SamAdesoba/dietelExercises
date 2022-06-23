package Inheritance;

import Inheritance1.Animal;
import Inheritance1.Vertebrate;
import org.junit.jupiter.api.Test;

class AnimalTest {

	@Test
	public void testMove() {
		Animal animal = new Animal();
		animal.livingThingMove();
	}

	@Test
	public void constructorTest() {
		Vertebrate vertebrate = new Vertebrate();
	}
}