package chapterTwo;

import java.util.Scanner;

public class ComparingInteger {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer : ");
        int x = input.nextInt();
        int xsquare = x * x;

        if(x > 100){
            System.out.printf("%d > 100%n", x);
        }

        if(x == 100){
            System.out.printf("%d == 100%n", x);
        }

        if(x != 100){
            System.out.printf("%d != 100%n", x);
        }

        if(x < 100){
            System.out.printf("%d < 100%n", x);
        }

        if(xsquare > 100){
            System.out.printf("%d > 100%n", xsquare);
        }

        if(xsquare == 100){
            System.out.printf("%d == 100%n", xsquare);
        }

        if(xsquare != 100){
            System.out.printf("%d != 100%n", xsquare);
        }

        if(xsquare < 100){
            System.out.printf("%d < 100%n", xsquare);
        }
    }
}
