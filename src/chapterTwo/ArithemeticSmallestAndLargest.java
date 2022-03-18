package chapterTwo;

import java.util.Scanner;

public class ArithemeticSmallestAndLargest {
    public static void main(String... args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int firstInteger = input.nextInt();
        System.out.print("Enter the second integer: ");
        int secondInteger = input.nextInt();
        System.out.print("Enter the third integer: ");
        int thirdInteger = input.nextInt();

        int sum = firstInteger + secondInteger + thirdInteger;
        int average = (firstInteger + secondInteger + thirdInteger)/3;
        int product = firstInteger * secondInteger * thirdInteger;

        System.out.printf("The sum is %d%n", sum);
        System.out.printf("The average is %d%n", average);
        System.out.printf("The product is %d%n", product);

        if(firstInteger > secondInteger && firstInteger > thirdInteger){
            System.out.println("The first integer is the largest " +firstInteger);
        }
        if(firstInteger < secondInteger && firstInteger < thirdInteger){
            System.out.println("The first integer is the smallest " +firstInteger);
        }

        if(secondInteger > firstInteger && secondInteger > thirdInteger){
            System.out.println("The second integer is the largest " +secondInteger);
        }
        if(secondInteger < firstInteger && secondInteger < thirdInteger){
            System.out.println("The second integer is the smallest " +secondInteger);
        }

        if(thirdInteger > firstInteger && thirdInteger > secondInteger){
            System.out.println("The third integer is the largest " +thirdInteger);
        }
        if(thirdInteger < firstInteger && thirdInteger < secondInteger){
            System.out.println("The third integer is the smallest " +thirdInteger);
        }

    }
}
