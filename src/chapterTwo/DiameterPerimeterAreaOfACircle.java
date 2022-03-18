package chapterTwo;

import java.util.Scanner;

public class DiameterPerimeterAreaOfACircle {
    public static void main(String... args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle : ");
        int radius = input.nextInt();

        double diameter = 2 * radius;
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.printf("The diameter of the circle is %f%n", diameter);
        System.out.printf("The circumference of the circle is %f%n", circumference);
        System.out.printf("The area of the circle is %f%n", area);

    }
}
