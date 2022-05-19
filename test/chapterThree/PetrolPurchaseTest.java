package chapterThree;

import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertNotNull;

public class PetrolPurchaseTest {
	@Test
	public void canCreatePetrolStation(){
		PetrolStation petrol = new PetrolStation();
		assertNotNull(petrol);
	}

//	@Test
//	public void
}
