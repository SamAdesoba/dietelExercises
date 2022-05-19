package Exercises;

import java.util.Arrays;

public class StudentGradesReport {

	public int[][] grades;
	private int numberOfStudent = 4;
	int[] sumArray = new int[numberOfStudent];
	public StudentGradesReport(int[][] grades, int numberOfStudent) {
		this.grades = grades;
		this.numberOfStudent = numberOfStudent;
	}

	public int getSumForStudent(int studentIndex) {
		int sum = 0;
		for (int i = studentIndex; i <= studentIndex; i++) {
			for (int j = 0; j < grades[i].length; j++) {

				sum += grades[i][j];
			}
		}
		return sum;
	}

	public double getAverageForStudent(int studentIndex) {
		double average = 0.0;
		for (int i = studentIndex; i <= studentIndex; i++) {
			for (int j = 0; j < grades[i].length; j++) {
				average = (double) getSumForStudent(studentIndex)/grades[i].length;
			}
		}
		return average;
	}

	public int getMaximumSum() {
		sumArray();
		for (int i = 0; i < sumArray.length; i++) {
			if(sumArray[i] < sumArray[i+1]){
				int temp = 0;
				temp = sumArray[i];
				sumArray[i] = sumArray[i+1];
				sumArray[i+1] = temp;
			}
		}
		return sumArray[0];
	}

	private void sumArray() {
		for (int i = 0; i < grades.length; i++) {
			sumArray[i] = getSumForStudent(i);
		}
	}

//	public int getPositionFor(int indexNumber) {
//		return 1;
//	}
}
