package practise;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class StudentScoreArray {
	private static int noOfStudents;
	private static int noOfSubjects;
	private static double average = 0;

	private static int[][] arrays;


	private static int[] arraysOfSums;

	private static int[] sumSorted;




	public static void main(String[] args) {
	students();
	}

	public static void students(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of subjects ");
		noOfSubjects = input.nextInt();

		System.out.print("Enter the number of students ");
		noOfStudents = input.nextInt();


		arrays = new int[noOfStudents][noOfSubjects];
		SecureRandom random = new SecureRandom();
		for(int i = 0;i<noOfStudents;i++){
			for(int j = 0; j<noOfSubjects; j++){
				System.out.println("Enter student "+(i+1)+" score for subject "+(j+1));
				arrays[i][j] = random.nextInt(30,100);
			}
			System.out.println();
		}
		System.out.println("=========================================================================================");

		System.out.print("STUDENT\t\t ");
		for (int i = 0; i < noOfSubjects; i++) {
			System.out.print("SUB"+(i+1)+"\t  ");
		}


		System.out.print("TOT\t  ");

		System.out.print("AVE\t\t");

		System.out.print("POS");

		System.out.println();
		System.out.println("=========================================================================================");


		for(int i = 0;i<noOfStudents;i++){
			arraysOfSums = new int[noOfStudents];
			System.out.printf("Student %d",(i+1));
			int[] sum = new int[noOfStudents];
			for(int j = 0; j<noOfSubjects; j++){
				System.out.printf("%8d",arrays[i][j]);
				sum[i] += arrays[i][j];
				average = sum[i]/arrays[j].length;

			}
			arraysOfSums[i] = sum[i];

			System.out.printf("%8d", sum[i]);
			System.out.printf("%10.2f", average);
			System.out.printf("%8d", sumSorted[i]);
			System.out.println();

		}

		for (int i = 0; i < arraysOfSums.length; i++) {
			sumSorted = arraysOfSums;
			int temp;
			for (int j = 0; j < arraysOfSums.length-1; j++){
				if (sumSorted[j] < sumSorted[j+1]){
					temp = sumSorted[j];
					sumSorted[j] = sumSorted[j+1];
					sumSorted[j+1] = temp;
				}
			}

		}








		System.out.println("=========================================================================================");
		System.out.println("=========================================================================================");
//		System.out.println("SUBJECT SUMMARY");
//		for (int i = 0; i < noOfStudents; i++) {
//			System.out.println(arraysOfSums[i]);
//		}
		for (int i = 0; i < arraysOfSums.length; i++) {
//			System.out.println("Subject "+(i+1));
//			System.out.println("Highest scoring student is: Student %d scoring %d");
//			System.out.println("Highest scoring student is: Student %d scoring %d");
//			System.out.println("Total Score is: %d");
//			System.out.println("Average Score is: %f");
//			System.out.println("Number of passes is: %d");
//			System.out.println("Number of fails is: %d");
//			System.out.println("The hardest subject is Subject %d with %d failures");
//			System.out.println("The easiest subject is Subject %d with %d passes");
//			System.out.println("The overall Highest score is scored by Student %d in subject %d scoring %d");
//			System.out.println("The overall Lowest score is scored by Student %d in subject %d scoring %d");
//			System.out.println("======================================================================================");

		}
		System.out.println();
//		System.out.println("CLASS SUMMARY");
//		System.out.println("======================================================================================");
//		System.out.println("Best Graduating Student is: Student %d scoring %d");
//		System.out.println("======================================================================================");
//		System.out.println();
//		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//		System.out.println("Worst Graduating student is : Student %d scoring %d");
//		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//		System.out.println();
//		System.out.println("======================================================================================");
//		System.out.println("Class total score is: %d");
//		System.out.println("Class Average score is: %f");
//		System.out.println("======================================================================================");

//		maximumNumber(sumArrays);



	}


}
