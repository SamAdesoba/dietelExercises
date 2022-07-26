package practise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		display("Enter either A or B");
		String userInput = input();
		System.out.println(userInput);
	}


	private static String input() {
		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.next();

		if(userInput.equalsIgnoreCase("A")){
			return userInput;
		}else if(userInput.equalsIgnoreCase("B")){
			return userInput;
		} else
		display("""
		You can only enter either A or B
		Please, enter either A or B
		 """);
		input();
		return "";
	}

	private static void display(String output) {
		System.out.println(output);
	}
}
