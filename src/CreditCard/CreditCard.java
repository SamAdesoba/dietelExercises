package CreditCard;

import java.util.Arrays;

public class CreditCard implements CreditCardNumber{
	private int[] arrays = new int[9];
	@Override
	public boolean isValid(int number) {
		return false;
	}

	@Override
	public int sumOfDoubleEvenPlaces(int number) {
		return 0;
	}

	@Override
	public void getDigit(int number) {
		number = 123456789;
		int[] arrays = new int[9];
		while (number > 0) {
			int counter = 0;
			while (counter<9) {
				arrays[counter] = number % 10;
				System.out.print( number % 10+" ");
				number = number / 10;
				counter++;
			}
		}
		System.out.println();
		Arrays.sort(arrays);
		for (int i = 0; i < 9; i++) {
			System.out.print(arrays[i]+" ");
		}
	}

	@Override
	public int sumOfOddPlace(int number) {
		return 0;
	}

	@Override
	public boolean prefixMatched(int number, int d) {
		return false;
	}

	@Override
	public int getSize(int d) {
		return 0;
	}

	@Override
	public int getPrefix(int number, int k) {
		return 0;
	}

	@Override
	public short displayCreditDigit() {
		for (int i = 0; i < 9; i++) {
			System.out.print(arrays[i]);
		}
		return 0;
	}
}
