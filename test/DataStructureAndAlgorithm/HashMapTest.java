package DataStructureAndAlgorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HashMapTest {
	private MyHashMap hashMap;

	@BeforeEach
	public void setUp(){
		hashMap = new MyHashMap();
	}
	@Test
	public void HashMapCanBeCreatedTest(){
		assertNotNull(hashMap);
	}

	@Test
	public void mapIsEmptyTest(){
		assertTrue(hashMap.isEmpty());
	}

	@Test
	public void mapCanAddItemTest(){
		hashMap.add("Type", "Gown");
		assertEquals(1, hashMap.size());
	}

	@Test
	public void mapIsNotEmptyWhenItemAddedTest(){
		hashMap.add("Type", "Gown");
		assertEquals(1, hashMap.size());
		assertFalse(hashMap.isEmpty());
	}

	@Test
	public void mapCanAddMoreItemsTest(){
		hashMap.add("Type", "Gown");
		hashMap.add("Colour", "Pink");
		hashMap.add("Size", "35");
		assertEquals(3, hashMap.size());
	}

	@Test
	public void mapCanGetValueByKeyTest(){
		hashMap.add("Type", "Gown");
		hashMap.add("Size", "35");
		hashMap.add("Colour", "Pink");
		assertEquals("Pink", hashMap.getValue("Colour"));
	}

	@Test
	public void mapCanGetKeyByValueTest(){
		hashMap.add("Type", "Gown");
		hashMap.add("Size", "35");
		hashMap.add("Colour", "Pink");
		assertEquals("Colour", hashMap.getKey("Pink"));
	}

	@Test
	public void mapCanReplaceTest(){
		hashMap.add("Type", "Gown");
		hashMap.add("Size", "35");
		hashMap.add("Colour", "Pink");
		hashMap.replace("Type", "Skirt");
		assertEquals("Skirt", hashMap.getValue("Type"));
	}

	@Test
	public void mapCanRemoveLastElementTest(){
		hashMap.add("Type", "Gown");
		hashMap.add("Size", "35");
		hashMap.add("Colour", "Pink");
		hashMap.remove(2);
		assertEquals(2, hashMap.size());
	}

	@Test
	public void mapCanRemoveAtAnyIndexTest(){
		hashMap.add("Type", "Gown");
		hashMap.add("Size", "35");
		hashMap.add("Colour", "Pink");
		hashMap.remove(1);
		assertEquals(2, hashMap.size());
		assertEquals("Pink", hashMap.getValue("Colour"));
	}


}
