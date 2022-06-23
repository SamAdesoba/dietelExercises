package chapterFive;

import java.util.Scanner;

public class GlobalWarmingFactQuiz {

	private static int counter;
	private static int answeredCount;
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("""
				Do you want to take the quiz?
				If YES Press 1
				If NO Press 2
				  """);
		int press = input.nextInt();

		switch(press){
			case 1: generateQuestions();

			case 2: break;
		}
		System.out.println(counter);

	}

	private static void generateQuestions() {
		input = new Scanner(System.in);
		System.out.println("""
				Welcome to global warming fact Quiz, we wish you the best!
				
				There are five options for each question, each correct option is a point.
				
				Enter the quiz number you which to answer.
				
				1. Quiz 1
				2. Quiz 2
				3. Quiz 3
				4. Quiz 4
				5. Quiz 5
				  """);
		int question = input.nextInt();
		switch (question) {
			case 1: question1();
			case 2: question2();
			case 3: question3();
			case 4: question4();
			case 5: question5();
		}
	}

	private static void question5() {
		input = new Scanner(System.in);
		System.out.println("""
				QUiz 5
				(a.)
				(b.)
				(c.)
				(d.)
				 """);
		String answer = input.next();
		String correctAnswer = "a";
		if(correctAnswer.equals(answer)) counter++;
		answeredCount++;
		if (answeredCount == 5) printResult();
		generateQuestions();
	}

	private static void printResult() {
		if(counter == 5) System.out.println("""
				Your score is 5
				Execellent!
				""");
		if(counter == 4) System.out.println("""
				Your score is 4
				Very good!
				""");
		if(counter <= 3) System.out.println(" Your score is"+ counter+"\n" +
				  " Time to brush up on your knowledge on global warming");
	}

	private static void question4() {
		input = new Scanner(System.in);
		System.out.println("""
				Quiz 4
				(a.)
				(b.)
				(c.)
				(d.)
				 """);
		String answer = input.next();
		String correctAnswer = "a";
		if(correctAnswer.equals(answer)) counter++;
		answeredCount++;
		generateQuestions();
	}

	private static void question3() {
		input = new Scanner(System.in);
		System.out.println("""
				Quiz 3
				(a.)
				(b.)
				(c.)
				(d.)
				 """);
		String answer = input.next();
		String correctAnswer = "c";
		if(correctAnswer.equals(answer)) counter++;
		answeredCount++;
		generateQuestions();
	}

	private static void question2() {
		input = new Scanner(System.in);
		System.out.println("""
				Quiz 2
				(a.)
				(b.)
				(c.)
				(d.)
				 """);
		String answer = input.next();
		String correctAnswer = "c";
		if(correctAnswer.equals(answer)) counter++;
		answeredCount++;
		generateQuestions();
	}

	private static void question1() {
		input = new Scanner(System.in);
		System.out.println("""
				Quiz 1
				(a.)
				(b.)
				(c.)
				(d.)
				 """);
		String answer = input.next();
		String correctAnswer = "b";
		if(correctAnswer.equals(answer)) counter++;
		answeredCount++;
		generateQuestions();
	}

}
