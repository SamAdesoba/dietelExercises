package practise;

import java.util.Arrays;

public class array {
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
	}
}
