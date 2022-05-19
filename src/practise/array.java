package practise;

import java.util.Arrays;

public class 	array {
	public static void main(String[] args) {
		char[][] array = new char[3][3];
		array[0][0] = 'X';
		array[0][1] = '0';
		array[0][2] = 'X';
		array[1][0] = 'X';
		array[1][1] = 'X';
		array[1][2] = 'X';
		array[2][0] = '0';
		array[2][1] = 'X';
		array[2][2] = '0';
		System.out.println(array[0][0]+" "+ array[0][1]+" "+array[0][2]);
		System.out.println(array[1][0]+" "+ array[1][1]+" "+array[1][2]);
		System.out.println(array[2][0]+" "+ array[2][1]+" "+array[2][2]);
		System.out.println();


		for(int i = 0;i<=2;i++){
			for(int j = 0; j<=2; j++){
				System.out.print(array[i][j]+"  ");
			}
			System.out.println();
			System.out.println();
		}

		int[] sam = new int[20];
		for (int i = 0; i < sam.length; i++) {
			System.out.print(sam[i]+" ");

		}
		System.out.println();
		for (int i = sam.length-1;i >= 0; i--) {
			sam[i]= i+1;
			System.out.print(sam[i]+" ");
		}
		System.out.println();
		System.out.println();


		char[][] letters = {{'X','O',' '},{'X','X','X'},{'X','O','X'}};
		for(int i = 0;i<=2;i++){
			for(int j = 0; j<=2; j++){
				System.out.print(letters[i][j]+"  ");
			}
			System.out.println();
		}

		int[][] arrays = {{1, 2, },
				  				{1, 2, 3},
				  				{1, 2, 3}};
		int sum = 0;
		for (int i = 0; i < arrays.length; i++) {
			for (int j = 0; j <arrays[i].length; j++) {
				sum += arrays[i][j];
			}
		}
		System.out.println("The sum of the array is " + sum);

		int[][] b = new int[2][];
		b[0] = new int[2];
		b[1] = new int[3];

		b[0][1] = 5;
		b[1][0] = 5;
		b[1][1] = 5;
		b[1][2] = 5;
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}
}
