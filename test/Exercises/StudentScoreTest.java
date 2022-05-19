//package Exercises;
//
//import Assignments.StudentsScoreSheet;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.testng.AssertJUnit.*;
//
//public class StudentScoreTest {
//	private StudentsScoreSheet student;
//
//	@BeforeEach
//	public void setUp() {
//		student = new StudentsScoreSheet("Student 1",{1,2,3});
//	}
//
//	@Test
//	public void canCreateStudentScoreSheetTest(){
//		assertNotNull(student);
//	}
//
//	@Test
//	public void createStudentNames(){
//		student.getName();
//		assertEquals("Student 1",student.getName());
//	}
//
//	@Test
//	public void createStudentArray(){
//		int[][] grades = {{1,2,3},
//				  				{4,5,6}};
//		assertEquals(1,student.getgrade());
//	}
//}
