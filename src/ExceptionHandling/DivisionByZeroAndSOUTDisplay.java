package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionByZeroAndSOUTDisplay {
	public static void main(String[] args) {
		int numerator  =  input("Enter numerator: ");
		int denominator  =  input("Enter denominator: ");
		try {
			int approximateQuotient = numerator / denominator;
			display("Result is "+approximateQuotient);
		}catch (ArithmeticException ex){
			display("It is Undefine");
			display("Zero cannot be a denominator");
		}
	}

	private static void display(String prompt) {
		System.out.println(prompt);
	}

	private static int input(String prompt){
		display(prompt);
		Scanner keyBoardInput = new Scanner(System.in);
		int number = 0;
		try {
			return keyBoardInput.nextInt();
		}catch (InputMismatchException e){
			display("I expect only integers");
			display("Try Again");
//			input(prompt);
			System.exit(3);
		}
		return number;
	}
}
