package Assignments;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String... args){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the number");
            int number = input.nextInt();
            for(int multiplier = 1; multiplier<=12;multiplier++){
                int result = number * multiplier;
                System.out.println(number+" * "+ multiplier +" = "+ result);
            }
    }
}
