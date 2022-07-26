package DependencyInversion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

	@Test
	public void moveTest(){
		Movement fly = new Fly();
		Movement swim = new Swim();
		Movement walk = new Walk();
		Animal animal = new Animal();



	}

}