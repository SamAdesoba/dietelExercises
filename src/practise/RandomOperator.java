package practise;

import java.security.SecureRandom;
import java.util.Scanner;

public class RandomOperator {

	static class RandomPickString {
		static SecureRandom myRandom = new SecureRandom();
		static Scanner myScanner = new Scanner(System.in);
		String str = pickRandom();
		String answer;
		int result;


		static String getRandom(String[] arr) {
			int rdm = myRandom.nextInt(arr.length);
			return arr[rdm];
		}
		static String pickRandom() {
			String[] operator = {"+", "-", "/", "*", "%"};
			String r = getRandom(operator);
			return r;
		}
		static int pickARandomNumber() {
			int rdm = (int) (myRandom.nextInt(20));
			return rdm;
		}
		void doMethod1() {
			int a = pickARandomNumber();
			int b = pickARandomNumber();


			if (str.equals("+")) {
				result = ( a + b );
				System.out.println(a + " ? " + b + " = " + result );


			} else if (str.equals("-")) {
				result = ( a - b );
				System.out.println(a + " ? " + b + " = " + result );


			} else if (str.equals("*")) {
				result = ( a * b );
				System.out.println(a + " ? "  + b + " = " + result );


			} else if (str.equals("/")) {
				result = ( a / b );
				System.out.println(a + " ? " + b + " = " + result );


			} else if (str.equals("%")) {
				result = ( a % b );
				System.out.println(a + " ? " + b + " = " + result );

			}
		}
		void checkAnswer() {
			do {
				System.out.println("What is the answer? ");
				answer = myScanner.nextLine();


				if (answer.equals(str)) {
					System.out.println("Correct!");
				} else {
					System.out.println("Nope! Try again. ");
				}
			} while ( !answer.equals(str));
		}

		public static void main(String[] args){
			RandomPickString rps = new RandomPickString();
			rps.doMethod1();
			rps.checkAnswer();
		}
	}

}
