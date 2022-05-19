package practise;

import java.util.Arrays;

public class TikTacToe {
	public static void main(String[] args) {
		board();
	}


	private static char[][] arrays = {{'1', '|', '2', '|', '3'},
			  									 {'-', '+', '-', '+', '-' },
			  									 {'4', '|', '5', '|', '6' },
			  									 {'-', '+', '-', '+', '-' },
			  									 {'7', '|', '8', '|', '9' },};
	private static void board() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(arrays[i][j]+" ");
			}
			System.out.println();
		}
	}
}
