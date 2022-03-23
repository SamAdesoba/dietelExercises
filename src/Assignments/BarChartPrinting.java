package Assignments;

import java.util.Scanner;

public class BarChartPrinting {
    public static void main(String... args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers between 1 and 30");
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int thirdNumber = input.nextInt();
        int fourthNumber = input.nextInt();
        int fifthNumber = input.nextInt();
            System.out.print(firstNumber);
            for(int i=1;i<=firstNumber;i++){
                System.out.print(" *");
            }
            System.out.println();
            System.out.print(secondNumber);
            for(int i = 1;i<=secondNumber;i++){
                System.out.print(" *");
            }
            System.out.println();
            System.out.print(thirdNumber);
            for(int i = 1;i<=thirdNumber;i++){
                System.out.print(" *");
            }
            System.out.println();
            System.out.print(fourthNumber);
            for(int i = 1;i<=fourthNumber;i++){
                System.out.print(" *");
            }
            System.out.println();
            System.out.print(fifthNumber);
            for(int i = 1;i<=fifthNumber;i++){
                System.out.print(" *");
            }
            System.out.println();
    }
}
