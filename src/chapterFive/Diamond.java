package chapterFive;

import java.util.Scanner;

public class Diamond {

		public static void main(String... args) {
			System.out.println("Enter an odd number for the number of rolls in your diamond: ");
			Scanner input = new Scanner(System.in);
			int number = input.nextInt();
			if(number==3){
				for (int j = 1; j < 2; j++) {
					for (int i = j; i <= 2; i++) {
						System.out.print("  ");
					}
					for (int i = 1; i < j; i++) {
						System.out.print("* ");
					}
					for (int i = 1; i <= j; i++) {
						System.out.print("* ");
					}
					System.out.println();
				}
				for (int j = 1; j <= 2; j++) {
					for (int i = 1; i <= j; i++) {
						System.out.print("  ");
					}
					for (int i = j; i <= 2; i++) {
						System.out.print("* ");
					}
					for (int i = j; i < 2; i++) {
						System.out.print("* ");
					}
					System.out.println();
				}
			}else if(number==5){
				for (int j = 1; j < 3; j++) {
					for (int i = j; i <= 3; i++) {
						System.out.print("  ");
					}
					for (int i = 1; i < j; i++) {
						System.out.print("* ");
					}
					for (int i = 1; i <= j; i++) {
						System.out.print("* ");
					}
					System.out.println();
				}
				for (int j = 1; j <= 3; j++) {
					for (int i = 1; i <= j; i++) {
						System.out.print("  ");
					}
					for (int i = j; i <= 3; i++) {
						System.out.print("* ");
					}
					for (int i = j; i < 3; i++) {
						System.out.print("* ");
					}
					System.out.println();
				}
			}
		}


}
