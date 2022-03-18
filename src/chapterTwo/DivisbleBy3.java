package chapterTwo;

import java.util.Scanner;

public class DivisbleBy3 {
    public static void main(String... args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the integer : ");
        int x = input.nextInt();

        if(x%3 == 0){System.out.printf("%n%n%d is divisible by 3 %n", x);}
        if(x%3 != 0){System.out.printf("%n%n%d is not divisible by 3 %n", x);}
    }
}
