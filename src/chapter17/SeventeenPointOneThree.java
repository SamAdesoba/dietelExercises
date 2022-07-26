package chapter17;

import java.security.SecureRandom;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SeventeenPointOneThree {
	public static void main(String[] args) {
		SecureRandom random = new SecureRandom();
		IntStream stream = random.ints(10, 0,1001);
		List<Integer> list = stream.boxed().toList();

		System.out.println(list);

		long evenCount = list.stream().filter(x -> x % 2 == 0).count();


		long oddCount = list.stream().filter(x -> x % 2 == 1).count();

		double evenAverage = (list.stream().filter(x -> x % 2 == 0).reduce(0, Integer::sum) * 1.0)/ evenCount;
		double oddAverage = (list.stream().filter(x -> x % 2 == 0).reduce(0, Integer::sum) * 1.0)/ evenCount;

		double average = ((list.stream().reduce(Integer::sum).orElse(0))* 1.0) / list.size();

		System.out.println("Even count is " + evenCount);
		System.out.println("Odd count is " + oddCount);
		System.out.println("Even average is " + evenAverage);
		System.out.println("Odd average is " + oddAverage);
		System.out.println("Average is " + average);


	}
}
