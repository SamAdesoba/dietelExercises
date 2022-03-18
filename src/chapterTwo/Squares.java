package chapterTwo;

import java.util.Scanner;

public class Squares {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer : ");
        int integer1 = input.nextInt();

        System.out.print("Enter the second integer : ");
        int integer2 = input.nextInt();

        int square1 = integer1 * integer1;
        int square2 = integer2 * integer2;

        System.out.printf("The square of the first integer is %d%n", square1);
        System.out.printf("The square of the second integer is %d%n", square2);

        int sum = square1 + square2;
        int difference = square1 - square2;

        System.out.printf("The sum of the squares is : %d%n", sum);
        System.out.printf("The difference of the squares is : %d%n", difference);
    }
}
