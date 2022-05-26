package Assignments;

import java.security.SecureRandom;
import java.util.Scanner;

public class RandomisedQuiz {
	private static final SecureRandom randomNumbers = new SecureRandom();

	public static void main(String[] args) {
//		Static quizStatus;
		Scanner input = new Scanner(System.in);



			for(int count=1;count<=2;count = count + 1){
				int firstRandomNumber = randomNumbers.nextInt(10);
				int secondRandomNumber = randomNumbers.nextInt(10);
				int randomOperator = 1 + randomNumbers.nextInt(4);
				switch (randomOperator){
					case 1:
						System.out.println(firstRandomNumber+" "+ "+" +" "+secondRandomNumber+" = "+ "?");
						int positiveResult = input.nextInt();
						if (positiveResult == firstRandomNumber + secondRandomNumber) {
							System.out.println("CORRECT!");
						}	else System.out.println("WRONG!");
						break;
					case 2:
						System.out.println(firstRandomNumber+" "+"-"+" "+secondRandomNumber+" = "+ "?");
						int negativeResult = input.nextInt();
						if (negativeResult == firstRandomNumber - secondRandomNumber) {
							System.out.println("CORRECT!");
						}	else System.out.println("WRONG!");
						break;
					case 3:
						System.out.println(firstRandomNumber+" "+"*"+" "+secondRandomNumber+" = "+ "?");
						int productResult = input.nextInt();
						if (productResult == firstRandomNumber * secondRandomNumber) {
							System.out.println("CORRECT!");
						}	else System.out.println("WRONG!");
						break;
					case 4:
						if(secondRandomNumber == 0){
							System.out.println("Undefine");
						}else
						System.out.println(firstRandomNumber+" "+"/"+" "+secondRandomNumber+" = "+ "?");
						int quotientResult = input.nextInt();
						if (quotientResult == firstRandomNumber / secondRandomNumber) {
							System.out.println("CORRECT!");
						}	else System.out.println("WRONG!");
						break;
				}
			}

		System.out.println();




	}
}
