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
       System.out.println();
       System.out.println();

       for (int i = 2; i <= 12; i++) {
          for (int j = 1; j <= 12; j++) {
             System.out.printf("%d X %d = %d\t\t\t\t\t\t",i,j,(i*j));
          }
          System.out.println();
       }

    }


}
