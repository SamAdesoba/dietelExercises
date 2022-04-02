package chapterTwo;

import java.util.Scanner;

public class SquaresAndCubes {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first number :");
		int firstDigit = input.nextInt();
		int square0 = firstDigit * firstDigit;
		int cube0 = square0 * firstDigit;

		System.out.println("Enter the second number : ");
		int secondDigit = input.nextInt();
		int square1 = secondDigit * secondDigit;
		int cube1 = square1 * secondDigit;

		System.out.println("Enter the third number :");
		int thirdDigit = input.nextInt();
		int square2 = thirdDigit * thirdDigit;
		int cube2 = square2 * thirdDigit;

		System.out.println("Enter the four number :");
		int fourthDigit = input.nextInt();
		int square3 = fourthDigit * fourthDigit;
		int cube3 = square3 * fourthDigit;

		System.out.println("Enter the fifth number :");
		int fifthDigit = input.nextInt();
		int square4 = fifthDigit * fifthDigit;
		int cube4 = square4 * fifthDigit;

		System.out.println("Enter the six number :");
		int sixthDigit = input.nextInt();
		int square5 = sixthDigit * sixthDigit;
		int cube5 = square5 * sixthDigit;

		System.out.println("Enter the seven number :");
		int seventhDigit = input.nextInt();
		int square6 = seventhDigit * seventhDigit;
		int cube6 = square6 * seventhDigit;

		System.out.println("Enter the eight number :");
		int eighthDigit = input.nextInt();
		int square7 = eighthDigit * eighthDigit;
		int cube7 = square7 * eighthDigit;

		System.out.println("Enter the nine number :");
		int ninthDigit = input.nextInt();
		int square8 = ninthDigit * ninthDigit;
		int cube8 = square8 * ninthDigit;

		System.out.println("Enter the ten number :");
		int tenthDigit = input.nextInt();
		int square9 = tenthDigit * tenthDigit;
		int cube9 = square9 * tenthDigit;

		System.out.println("Enter the last number :");
		int lastDigit = input.nextInt();
		int square10 = lastDigit * lastDigit;
		int cube10 = square9 * tenthDigit;

		System.out.println("Number  "+"Square  "+"Cube  ");
		System.out.println("  "+ firstDigit +"      "+ square0 +"        "+ cube0);
		System.out.println("  "+ secondDigit +"      "+ square1 +"        "+ cube1);
		System.out.println("  "+ thirdDigit +"      "+ square2 +"        "+ cube2);
		System.out.println("  "+ fourthDigit +"      "+ square3 +"        "+ cube3);
		System.out.println("  "+ fifthDigit +"      "+ square4 +"       "+ cube4);
		System.out.println("  "+ sixthDigit +"      "+ square5 +"       "+ cube5);
		System.out.println("  "+ seventhDigit +"      "+ square6 +"       "+ cube6);
		System.out.println("  "+ eighthDigit +"      "+ square7 +"       "+ cube7);
		System.out.println("  "+ ninthDigit +"      "+ square8 +"       "+ cube8);
		System.out.println("  "+ tenthDigit +"      "+ square9 +"       "+ cube9);
		System.out.println("  "+ lastDigit +"     "+ square10 +"      "+ cube10);
	}
}
