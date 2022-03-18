package chapterTwo;

import java.util.Scanner;

public class MultipleOfNumber {
    public static void main(String... args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer : ");
        int firstInteger = input.nextInt();

        System.out.print("Enter the second integer : ");
        int secondInteger = input.nextInt();

        if(firstInteger > secondInteger && (3*firstInteger)%(2*secondInteger) == 0){
            System.out.print("The first number tripled is a multiple of the second number");
        }
        if(firstInteger > secondInteger && (3*firstInteger)%(2*secondInteger) != 0){
            System.out.print("The first number tripled is not a multiple of the second number");
        }



    }
}
