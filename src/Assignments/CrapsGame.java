package Assignments;

import java.security.SecureRandom;

public class CrapsGame {
	public static void main(String[] args) {
		twoRandomNumbers();
		printRandomNumbers();
	}

	private static void printRandomNumbers() {
		System.out.println();
	}

	private static int twoRandomNumbers() {
		SecureRandom random = new SecureRandom();
		int firstRandomNumber = 1 + random.nextInt(6);
		int secondRandomNumber = 1 + random.nextInt(6);
		return firstRandomNumber;

	}
}
