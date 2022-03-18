package tddClass;

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

}
