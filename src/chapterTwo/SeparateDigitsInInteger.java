package chapterTwo;

import java.util.Scanner;

public class SeparateDigitsInInteger {
    public static void main(String... args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the five digits integer : " );
        int fiveDigits = input.nextInt();

        int firstDigit = (fiveDigits%100000)/10000;
        int SecondDigit = (fiveDigits%10000)/1000;
        int thirdDigit = (fiveDigits%1000)/100;
        int fourthDigit = (fiveDigits%100)/10;
        int fifthDigit = fiveDigits%10;

        System.out.printf("%d  %d  %d  %d  %d%n",firstDigit,SecondDigit,thirdDigit,fourthDigit,fifthDigit);

    }
}
