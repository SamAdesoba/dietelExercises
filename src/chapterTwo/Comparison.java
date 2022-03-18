package chapterTwo;

import java.util.Scanner;

public class Comparison {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        double x = input.nextDouble();

        System.out.print("Enter the second number : ");
        double y = input.nextDouble();

        System.out.print("Enter the third number :");
        double z = input.nextDouble();

        double smallest = x;
        double biggest = x;

        if (y > x){biggest = y;}
        if (z > x){biggest = z;}
        if (y < x){smallest = y;}
        if (z < x){smallest = z;}

        System.out.printf("%n%n The smallest number is : %.0f", smallest);
        System.out.printf("%n%n The biggest number is : %.0f", biggest);
    }
}
