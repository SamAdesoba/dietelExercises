package chapterTwo;

import java.util.Scanner;

public class SeparatingNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the five digit integer : ");
		int fiveDigitInteger = input.nextInt();
		int firstDigit = (fiveDigitInteger/10000);
		int secondDigit = ((fiveDigitInteger/1000)%10);
		int thirdDigit = ((fiveDigitInteger/100)%10);
		int fourthDigit = ((fiveDigitInteger/10)%10);
		int fifthDigit = (fiveDigitInteger%10);
		System.out.println(firstDigit+" "+secondDigit+" "+thirdDigit+" "+fourthDigit+" "+fifthDigit);
	}
}
