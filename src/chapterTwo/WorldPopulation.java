package chapterTwo;

import java.util.Scanner;

public class WorldPopulation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the current population in billions : ");
		double currentPopulation = input.nextDouble();

		System.out.println("Enter the rate in percentage : ");
		double rate = input.nextDouble();

		System.out.println("Enter the numbers of years : ");
		int years = input.nextInt();

		double population = currentPopulation * Math.exp(rate * years);
		System.out.println("The  population of the world in "+years+" years will be "+population+" billions");

	}
}
