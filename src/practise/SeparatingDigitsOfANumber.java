package practise;

import java.util.Arrays;

public class SeparatingDigitsOfANumber {
	public static void main(String[] args) {
		int number = 123456789;
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
}
