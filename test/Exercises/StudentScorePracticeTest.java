package Exercises;

import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;

public class StudentScorePracticeTest {
	@Test
	public void sumPerStudentTest() {
		int numberOfStudent = 4;
		int[][] grades = {{1, 2, 3},
				  				{4, 5, 6}};
		StudentGradesReport report = new StudentGradesReport(grades, numberOfStudent);
		assertEquals(6,report.getSumForStudent(0));
		assertEquals(15,report.getSumForStudent(1));
	}

	@Test
	public void averagePerStudentTest() {
		int numberOfStudent = 4;
		int[][] grades = {{10, 10, 10},
				  {4, 5, 6, 3}};
		StudentGradesReport report = new StudentGradesReport(grades, numberOfStudent);
		assertEquals(10.0,report.getAverageForStudent(0));
		assertEquals(4.5,report.getAverageForStudent(1));
	}

	@Test
	public void positionTest(){
		int numberOfStudent = 3;
		int[][] grades = {{1, 2, 3},
				  				{4, 5, 6},
				  				{7, 8, 9},
				  				{10, 11, 12}};
		StudentGradesReport report = new StudentGradesReport(grades, numberOfStudent);
		assertEquals(6,report.getSumForStudent(0));
		assertEquals(15,report.getSumForStudent(1));
		assertEquals(24,report.getSumForStudent(2));
		assertEquals(33,report.getSumForStudent(3));
		assertEquals(33, report.getMaximumSum());
//		assertEquals(1,report.getPositionFor(3));
	}
}
