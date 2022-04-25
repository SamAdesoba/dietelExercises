package Exercises;

import Assignments.StudentsScoreSheet;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.*;

public class StudentScoreTest {
	@Test
	public void canCreateStudentScoreSheetTest(){
		StudentsScoreSheet student = new StudentsScoreSheet("Student 1");
		assertNotNull(student);
	}

	@Test
	public void createStudentNames(){
		StudentsScoreSheet student = new StudentsScoreSheet("Student 1");
		student.getName();
		assertEquals("Student 1",student.getName());

	}
}
