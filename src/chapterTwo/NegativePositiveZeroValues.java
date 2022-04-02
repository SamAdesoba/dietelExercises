package chapterTwo;

import java.util.Scanner;

public class NegativePositiveZeroValues {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first number : ");
		int firstNumber = input.nextInt();

		System.out.println("Enter the second number : ");
		int secondNumber = input.nextInt();

		System.out.println("Enter the third number : ");
		int thirdNumber = input.nextInt();

		System.out.println("Enter the four number : ");
		int fourthNumber = input.nextInt();

		System.out.println("Enter the fifth number : ");
		int fifthNumber = input.nextInt();


		int zeroCount = 0;
		int negativeCount = 0;
		int positiveCount = 0;


			if (firstNumber == 0)
				zeroCount = zeroCount + 1;

			if (secondNumber == 0)
				zeroCount = zeroCount + 1;

			if (thirdNumber == 0)
				zeroCount = zeroCount + 1;

			if (fourthNumber == 0)
				zeroCount = zeroCount + 1;

			if (fifthNumber == 0)
				zeroCount = zeroCount + 1;



		if (firstNumber < 0)
			negativeCount = negativeCount + 1;

		if (secondNumber < 0)
			negativeCount = negativeCount + 1;

		if (thirdNumber < 0)
			negativeCount = negativeCount + 1;

		if (fourthNumber < 0)
			negativeCount = negativeCount + 1;

		if (fifthNumber < 0)
			negativeCount = negativeCount + 1;



		if(firstNumber > 0)
			positiveCount = positiveCount + 1;

		if(secondNumber > 0)
			positiveCount = positiveCount +1;

		if(thirdNumber > 0)
			positiveCount = positiveCount + 1;

		if(fourthNumber > 0)
			positiveCount = positiveCount + 1;

		if(fifthNumber > 0)
			positiveCount = positiveCount + 1;


		System.out.println("The number of zero number(s) is/are "+ zeroCount);
		System.out.println("The number of positive number(s) is/are "+ positiveCount);
		System.out.println("The number of negative number(s) is/are "+ negativeCount);

	}
}
