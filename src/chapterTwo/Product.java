package chapterTwo;

import java.util.Scanner;

public class Product {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter b= ");
        double b = input.nextDouble();

        System.out.print("Enter c= ");
        double c = input.nextDouble();

        double a= b * c;
        System.out.println("Enter a= " +a);
    }
}
