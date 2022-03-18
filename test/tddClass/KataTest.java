package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KataTest {
    @Test
    public void sumTest(){
        Kata calculator = new Kata();
        int actual = calculator.add(4,5);
        assertEquals(9,actual);
    }


    @Test
    public void subtractTest(){
        Kata calculator = new Kata();
        int result = calculator.subtract(7,4);
        assertEquals(3,result);
    }

    @Test
    public void absoluteSubtractTest(){
        Kata cal = new Kata();
        int result = cal.subtract(3,7);
        assertEquals(4, result);
    }
    @Test
    public void areaTest(){
        Kata cal = new Kata();
        double area = cal.findAreaWith(7);
        assertEquals(154.0, area);
    }
    @Test
    public void bitFlipperTest(){
        Kata flipper = new Kata();
        int result = flipper.flip(0);
        assertEquals(1,result);

        result = flipper.flip(1);
        assertEquals(0,result);

    }

    /*@Test
    public void palindromeTest(){
        Kata kata = new Kata();
        //assertTrue(kata.ispalindrome(12321));
        boolean result = Kata.ispalindrome(fiveDigitNumber : 12345);
        assertEquals(true,result);
        result = Kata.ispalindrome(fiveDigitNumber : 12321);
        assertEquals(true,result);

    }*/

    @Test
    public void quotient(){
        Kata calculate = new Kata();
        int result = calculate.quotient(6,3);
        assertEquals(2,result);


    }
    @Test
    public void evenNumber(){
        int number = 2;
        while (number <= 10){
            System.out.print(number+ " ");
            number = number + 2;
        }
    }
    @Test
    public void evenNumber2(){
        int number = 1;
        while (number <= 10){
            if(number%2 == 0)
            System.out.print(number+ " ");
            number = number + 1;
        }
    }
    @Test
    public void evenNumber3(){
        int number = 2;
        while (number <= 100){
            System.out.print(number+ " ");
            number = number + 2;
        }
    }
    @Test
    public void utmeDrillerTest(){
        Kata setUp = new Kata();
        setUp.numberOfCopies(3);
        assertEquals(6000, setUp.getNumberOfCopies());
    }

    @Test
    public void utmeDrillerTest2(){
        Kata setUp = new Kata();
        setUp.numberOfCopies(7);
        assertEquals(12600, setUp.getNumberOfCopies());
    }

    @Test
    public void utmeDrillerTest3(){
        Kata setUp = new Kata();
        setUp.numberOfCopies(20);
        assertEquals(32000, setUp.getNumberOfCopies());
    }

    @Test
    public void utmeDrillerTest4(){
        Kata setUp = new Kata();
        setUp.numberOfCopies(40);
        assertEquals(60000, setUp.getNumberOfCopies());
    }

    @Test
    public void utmeDrillerTest5(){
        Kata setUp = new Kata();
        setUp.numberOfCopies(80);
        assertEquals(104000, setUp.getNumberOfCopies());
    }

    @Test
    public void utmeDrillerTest6(){
        Kata setUp = new Kata();
        setUp.numberOfCopies(120);
        assertEquals(144000, setUp.getNumberOfCopies());
    }

    @Test
    public void numbers(){
        Kata sam = new Kata();
        int abi = sam.number(6,3);
        assertEquals(0, abi);
    }
    @Test
    public void evenNumber8(){
        Kata number = new Kata();
        number.isEven(8);
        assertTrue(number.isEven(8));
    }

}
