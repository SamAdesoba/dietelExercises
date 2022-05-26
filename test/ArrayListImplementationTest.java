import Exercises.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListImplementationTest {
	private
	ArrayList arrays;

	@BeforeEach
	public void setUp(){
		arrays = new ArrayList();
	}
	@Test
	public void canCreateAnArrayListTest() {
		assertNotNull(arrays);
	}

	@Test
	public void canAddElementToArrayListTest() {
		arrays.add("ade");
		assertEquals(1, arrays.size());
	}

	@Test
	public void canAddElementAndGetByIndexTest() {
		arrays.add("ade");
		arrays.add("sam");
		assertEquals("sam", arrays.get(1));
	}

	@Test
	public void canAddElementByIndexTest() {
		arrays.add("ade");
		arrays.add("sa");
		arrays.add("sam");
		arrays.add("sams");
		arrays.add("samso");
		arrays.add("samson");
		arrays.add(3,"adesoba");
		assertEquals("adesoba", arrays.get(3));
		assertEquals("samso", arrays.get(4));
	}

	@Test
	public void canRemoveElementTest() {
		arrays.add("ade");
		arrays.add("sam");
		arrays.remove(1);
		assertEquals(1, arrays.size());
	}

	@Test
	public void canGetElementByIndexTest(){
		arrays.add("ade");
		arrays.add("sam");
		arrays.add("samson");
		assertEquals("sam", arrays.get(1));
		assertEquals("samson", arrays.get(2));
	}

	@Test
	public void canRemoveElementByIndexTest(){
		arrays.add("ade");
		arrays.add("sam");
		arrays.add("samson");
		arrays.remove(1);
		assertEquals("samson", arrays.get(1));
	}

}
