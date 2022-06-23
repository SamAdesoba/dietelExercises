package Abstractions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {

	private List list;

	@BeforeEach
	void setUp() {
		list = new ArrayList();
	}

	@Test
	void testAdd() {
		list.add("Boxers for boyfriend");
		list.add("Boxers for boyfriend");
		list.add("Boxers for boyfriend");
		assertEquals(3, list.size());
	}

	@Test
	void addAndGetTest(){
		list.add("Bra");
		list.add("pant");
		assertEquals("Bra",list.get(0));
		assertEquals("pant",list.get(1));
	}


	@Test
	void testRemoveByIndex() {
		list.add("purple");
		list.add("green");
		list.remove(0);
		assertEquals(1,list.size());
	}

	@Test
	void testRemoveByElement() {
		list.add("purple");
		list.add("green");
		list.remove("purple");
		assertEquals(1,list.size());
	}

	@Test
	void testSize() {
		list.add("Bra");
		list.add("pant");
		list.add("purple");
		list.add("green");
		list.add("yellow");
		assertEquals(5, list.size());
		list.add("orange");
		assertEquals(6, list.size());
	}

	@Test
	void testIncreaseSizeWithIndexInsertion() {
		list.add("Bra");
		list.add("pant");
		list.add("purple");
		list.add("green");
		list.add("yellow");
		assertEquals(5, list.size());
		list.add(1,"orange");
		assertEquals(6, list.size());
		assertEquals("orange", list.get(1));
		assertEquals("pant", list.get(2));
	}
}