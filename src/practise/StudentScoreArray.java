package practise;

import java.util.Scanner;

public class StudentScoreArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of subjects ");
		int noOfSubjects = input.nextInt();

		System.out.println("Enter the number of students ");
		int noOfStudents = input.nextInt();


		int[][] array = new int[noOfStudents][noOfSubjects];
		for(int i = 0;i<noOfStudents;i++){
			System.out.println("Enter the "+noOfSubjects+" scores for student and press enter after each score "+(i+1));
			for(int j = 0; j<noOfSubjects; j++){
				array[i][j] = input.nextInt();
			}
			System.out.println();
		}

		System.out.print("           subject 1 ");
		for (int i = 1; i < noOfSubjects; i++) {
			System.out.print("   subject "+(i+1));
		}
		System.out.println();
		for(int i = 0;i<noOfStudents;i++){
			System.out.print("Student "+(i+1)+"\t\t");
			for(int j = 0; j<noOfSubjects; j++){
				System.out.print(array[i][j]+"\t\t\t");
			}
			System.out.println();
		}
	}
}
