package tddClass;

import java.util.Scanner;

public class Kata {

    public int add(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        return result;
    }
    public int subtract(int firstNumber, int secondNumber) {
        int result = 0;
        if (firstNumber > secondNumber){result = firstNumber-secondNumber;}
        if (secondNumber > firstNumber){result = secondNumber - firstNumber;}
        return result;
    }

    public double findAreaWith(int radius) {
        return (22 * radius * radius)/7.0;
    }

    public int flip(int bit) {
        int result = 0;
        if(bit == 0) result = 1;
        if(bit == 1) result = 0;
        return result;
    }

    public int quotient(int firstNumber, int secondNumber) {
        int num1 = firstNumber;
        int num2 = secondNumber;
        if (secondNumber > firstNumber){
            num1 = secondNumber;
            num2 = firstNumber;
        }
        int result = num1/num2;
        return result;
    }
    int total;
    public void numberOfCopies(int numberOfCopies) {
        if (numberOfCopies >= 1 && numberOfCopies <= 4){
            total =  numberOfCopies * 2000;
        }else if(numberOfCopies >= 5 && numberOfCopies <= 9){
            total =  numberOfCopies * 1800;
        }else if(numberOfCopies >= 10 && numberOfCopies <= 29){
            total =  numberOfCopies * 1600;
        }else if(numberOfCopies >= 30 && numberOfCopies <= 49){
            total =  numberOfCopies * 1500;
        }else if(numberOfCopies >= 50 && numberOfCopies <= 99){
            total =  numberOfCopies * 1300;
        }else if(numberOfCopies >= 100 && numberOfCopies <= 199){
            total =  numberOfCopies * 1200;
        }else if(numberOfCopies >= 200 && numberOfCopies <= 499){
            total =  numberOfCopies * 1100;
        }else if(numberOfCopies >= 500){
            total =  numberOfCopies * 1000;
        }
    }

    public int getNumberOfCopies() {
        return total;
    }

    public int number(int i, int i1) {
        int abi = i%i1;
        return abi;
    }


    public boolean isEven(int integer) {
        if(integer%2 == 0){
            return true;
        }else
        return false;
    }


    public int isBiggest(int firstDigit, int secondDigit, int thirdDigit, int fourthDigit, int fifthDigit) {
        int a = firstDigit;
        int b = secondDigit;
        int c = thirdDigit;
        int d = fourthDigit;
        int e = fifthDigit;
        if (a >= b && a >= c && a >= d && a >= e){
            return a;
        }else if(b >= a && b >= c && b >= d && b >= e){
            return b;
        }else if(c >= a && c >= b && c >= d && c >= e){
            return c;
        }else if(d >= a && d >= b && d >= c && d >= e){
            return d;
        }else
        return e;
    }

    public int factorOf(int integer) {
        int i = 1;
        int counter = 0;
        while (i <= integer) {
            if (integer % i == 0) {
                ++counter;
            }
            ++i;
        }

        return counter;
    }

    /*public boolean primeNumber(int integer) {
        boolean result = false;
        int i = 1;
        int counter = 0;
        while (i <= integer){
            if(integer%i == 0){
                ++counter;
            }
            ++i;
        }
        if(counter <= 2) result = true;
        return result;
    }*/
    public boolean primeNumber(int integer){
        if(factorOf(integer) <= 2) return true;
        return false;

    }


}
