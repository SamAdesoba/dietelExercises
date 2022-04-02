//package Assignments;
//
//import java.security.SecureRandom;
//
//public class RandomQuiz {
//
//
//	public static void main(String[] args) {
//		int getRandomNumber = generateNumber();
//		char getRandomOperator = generateOperator();
//		int question = generateQuestion();
//	}
//
//	public static int generateQuestion(int firstNumber,int secondNumber) {
//		System.out.println(firstNumber +" "+ generateOperator()+ " "+ secondNumber+"=" );
//	}
//
//	public static char generateOperator() {
//		return switch (generateNumber()) {
//			case '+' -> '+';
//			case '-' -> '-';
//			case 'X' -> 'X';
//			case '/' -> '/';
//			default -> '&';
//		};
//
//	}
//
//	public static int generateNumber() {
//		int firstNumber = randomNumber();
//		int secondNumber = randomNumber();
//		return generateNumber();
//	}
//
//	public static int randomNumber() {
//		SecureRandom random = new SecureRandom();
//		return 1 + random.nextInt(5);
//	}
//
//}
