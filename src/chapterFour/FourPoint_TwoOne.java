package chapterFour;

import java.util.Scanner;

public class FourPoint_TwoOne {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int max = 0;
		for (int i = 0; i < 10; i++) {
			System.out.print("Enter Salesperson"+ (i+1)+" total sales: ");
			int total = input.nextInt();
			if(total > max) {
				max = total;
			}
		}
		System.out.println();
		System.out.println("The maximum total sales is "+ max);
	}
}
