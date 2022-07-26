package HackerankSolutions;


import chapterEight.HugeInteger;

import java.math.BigInteger;
import java.util.stream.IntStream;

import static java.math.BigInteger.ONE;


public class BigIntegerFactorial {
	public static void main(String[] args) {
//		int n = 5;
//		BigInteger fact = factorial(n);
//		System.out.println(fact);
//		online
//		13/03/2022
//		You received a message on your phone, but your version of WhatsApp Web doesn't support it.
//		TODAY
//		IntStream sumOfNumber1 = IntStream.rangeClosed(1, 10).filter(x -> x % 2 == 0);
//
//		System.out.println(sumOfNumber1);
//
//		int product = IntStream.rangeClosed(1, 5)
//				  .reduce((acc, el) -> acc * el)
//				  .getAsInt();
//		System.out.println(product);
//
//        /*no need for .getAsInt() which deals with the Optional class
//        the identity sum up the answer based on the number in the identity e.g
//        reduce(2, (acc, el) -> acc * el)
//        this will result to 240*/
//		int product1 = IntStream.rangeClosed(1, 5)
//				  .reduce(2, (acc, el) -> acc * el);
//		System.out.println(product1);

		System.out.println(IntStream.rangeClosed(1, 20).filter((x -> x % 2 == 1)).map(x -> x * x * x).sum());


		System.out.println(IntStream.rangeClosed(1, 20).filter(x -> x % 2 != 0).map(x -> x * x * x).sum());
	}

	private static BigInteger factorial(int n) {
		BigInteger num = BigInteger.valueOf(n);
		BigInteger result = BigInteger.valueOf(1);
		while (!(num.equals(BigInteger.valueOf(1)) || num.equals(ONE))) {
			result = result.multiply(num);
			num = num.subtract(ONE);
		}
		return result;
	}




}
