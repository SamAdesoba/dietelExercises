package chapterTwo;

import java.util.Scanner;

public class LargestAndSmallestInteger {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer : ");
        double x = input.nextDouble();

        System.out.print("Enter the second integer : ");
        double y = input.nextDouble();

        System.out.print("Enter the third integer : ");
        double z = input.nextDouble();

        if(x > y && x > z){
            System.out.printf("%n%nThe largest integer is : %.0f%n", x);
        }

        if(x < y && x < z){
            System.out.printf("%n%nThe smallest integer is : %.0f%n", x);
        }

        if(y > x && y > z){
            System.out.printf("%n%nThe largest integer is : %.0f%n", y);
        }

        if(y < x && y < z){
            System.out.printf("%n%nThe smallest integer is : %.0f%n", y);
        }

        if(z > x && z > y){
            System.out.printf("%n%nThe largest integer is : %.0f%n", z);
        }

        if(z < x && z < y){
            System.out.printf("%n%nThe smallest integer is : %.0f%n", z);
        }
    }
}
