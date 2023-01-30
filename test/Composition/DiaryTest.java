package Composition;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.testng.AssertJUnit.*;

public class DiaryTest {
	private Diary samDiary;

	@BeforeEach
	public void setUp(){
		samDiary = new Diary("Samex", "1234", "07068038660", "adesobasamson@gmail.com");

	}
	@Test
	public void canCreateDiaryTest(){
		assertNotNull(samDiary);
		assertEquals("Samex", samDiary.getUserName());
		assertEquals("1234", samDiary.getPassword());
		assertEquals("07068038660", samDiary.getPhoneNumber());
		assertEquals("adesobasamson@gmail.com", samDiary.getEmail());
		assertEquals(0,samDiary.getNumberOfEntries());
	}


	@Test
	public void diaryIsLockedOnDefaultTest(){
		assertTrue(samDiary.isLock());
	}

	@Test
	public void diaryCanBeUnlockedTest(){
		assertTrue(samDiary.isLock());
		samDiary.unlock("1234");
		assertFalse(samDiary.isLock());
	}

	@Test
	public void diaryCanBeLockedTest(){
		samDiary.unlock("1234");
		assertFalse(samDiary.isLock());
		samDiary.Lock();
		assertTrue(samDiary.isLock());
	}
	
	@Test
	void diaryCanHaveTitleTest(){
		samDiary.unlock("1234");
		assertFalse(samDiary.isLock());
		samDiary.addTitle();
		assertEquals("Adesoba",samDiary.getTitle());
	}

	@Test
	void diaryCanHaveDateTest(){
		samDiary.addDate();
		assertEquals("Tue, 11-29-2022 09:19:40 pm",samDiary.getDate());
	}

	@Test
	public void diaryCanAddEntry(){
		samDiary.addEntry("New Entry", " My first Entry Body");
		assertEquals(1, samDiary.getNumberOfEntries());
	}

	@Test
	void diaryCanDeleteEntryTest(){
		samDiary.addEntry("New Entry1", " My first Entry Body");
		samDiary.addEntry("New Entry2", " My second Entry Body");
		samDiary.addEntry("New Entry3", " My third Entry Body");
		assertEquals(3, samDiary.getNumberOfEntries());
		samDiary.deleteEntry("New Entry3", " My third Entry Body");
		assertEquals(2, samDiary.getNumberOfEntries());
	}



//	Cannot retrieve entry when locked
//	can search by title
//	can search by date
			  


}
