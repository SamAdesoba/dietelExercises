package chapterSeven;

import java.util.Arrays;
import java.util.Scanner;

public class SevenPoint_TwoNine {
	private static int[] arrays;
	private static double[] doubleArrays;
	private static int n;

	public SevenPoint_TwoNine(int[] arrays, int n, double[] doubleArrays) {
		SevenPoint_TwoNine.arrays = arrays;
		SevenPoint_TwoNine.n = n;
		SevenPoint_TwoNine.doubleArrays = doubleArrays;
	}

	public static void main(String[] args) {
		//Fibonacci
		printFibonacci();
		displayLargestNumber();
		printFibonacciDouble();
		displayLargestNumberDouble();

	}

	private static void displayLargestNumberDouble() {
		System.out.println("The largest number for the double is "+ doubleArrays[doubleArrays.length-1]);
		System.out.println();
	}

	private static void printFibonacciDouble() {
		doubleArrays = new double[n];
		doubleArrays[0] = 0;
		doubleArrays[1] = 1;
		for (int i = 2; i < doubleArrays.length; i++) {
			doubleArrays[i] = doubleArrays[i-1] + doubleArrays[i-2];
		}
		for (double doubleArray : doubleArrays) {
			System.out.print(doubleArray + ", ");
		}
		System.out.println();
		System.out.println();
	}

	private static void displayLargestNumber() {
		System.out.println("The largest number is "+ arrays[arrays.length-1]);
		System.out.println();
	}

	private static void printFibonacci() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number nth number: ");
		n = input.nextInt();
		arrays = new int[n];
		arrays[0] = 0;
		arrays[1] = 1;
		for (int i = 2; i < arrays.length; i++) {
			arrays[i] = arrays[i-1] + arrays[i-2];
		}
		for (int array : arrays) {
			System.out.print(array + ", ");
		}
		System.out.println();
		System.out.println();
	}
}
