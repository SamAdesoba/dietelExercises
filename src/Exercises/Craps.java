package Exercises;

import java.security.SecureRandom;

public class Craps {
	private static int firstNumber;
	private static int secondNumber;
	private static int sumOfRandoms = 0;

	public void firstRandomNumber(int bound) {
		SecureRandom random = new SecureRandom();
		Craps.firstNumber  = 1 + random.nextInt(bound);
	}

	public int getFirstRandomNumber() {
		return firstNumber;
	}

	public void secondRandomNumber(int bound) {
		SecureRandom random = new SecureRandom();
		Craps.secondNumber = 1 + random.nextInt(bound);
	}

	public int getSecondRandomNumber() {
		return secondNumber;
	}

	public void sum(int firstNumber, int secondNumber) {
		firstNumber = Craps.firstNumber;
		secondNumber = Craps.secondNumber;
		Craps.sumOfRandoms = firstNumber + secondNumber;
	}

	public int getSum() {
		return sumOfRandoms;
	}

	public int getWinResponse() {
		int overallSum = Craps.sumOfRandoms;
		if (overallSum == 7 || overallSum == 11){
			System.out.println("Win!");
		}
			return overallSum;
	}

	public int getLoseResponse() {
		int overallSum = Craps.sumOfRandoms;
		if (overallSum == 2 || overallSum == 3 || overallSum == 12){
			System.out.println("Lose!");
		}
		return overallSum;
	}
}
