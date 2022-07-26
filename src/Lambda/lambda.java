package Lambda;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class lambda {
	public static void main(String[] args) {
//		IntStream sumOfNumber1 = IntStream.rangeClosed(1, 10).filter(x -> x % 2 == 0);
//
//		System.out.println(sumOfNumber1);
//
//		int product = IntStream.rangeClosed(1, 5)
//				  .reduce((acc, el) -> acc * el)
//				  .getAsInt();
//		System.out.println(product);

        /*no need for .getAsInt() which deals with the Optional class
        the identity sum up the answer based on the number in the identity e.g
        reduce(2, (acc, el) -> acc * el)
        this will result to 240*/
//		int product1 = IntStream.rangeClosed(1, 5)
//				  .reduce(2, (acc, el) -> acc * el);
//		System.out.println(product1);


		System.out.println(IntStream.rangeClosed(1, 354354).filter((x -> x % 2 != 0)).map(x -> x * x * x).sum());




//		String sentence = "Sam can nack anything";
//
//		sentence = sentence.toLowerCase();
//		String[] element = sentence.split(" ");
//
//		List<String> stringList = Stream.of(element)
//				  .sorted()
//				  .toList();
//
//		System.out.println(stringList);



//				System.out.println(IntStream.rangeClosed(1, 20)
//						  .filter((x -> x % 2 != 0)).map(x -> x * x * x)
//						  .sum());
//				SecureRandom random = new SecureRandom();
//				random.ints(10, 1, 7)
//						  .filter((x -> x % 2 == 0))
//
//						  .forEach(System.out::println);
//
//
//        because its only returns a method ,we use a method reference
//
//				//to generate a stream of 20 numbers ranging from 1 to 13
//				String  result = random.ints(20, 1, 13)
//						  //                returning each element as a string value
//						  .mapToObj(String::valueOf).collect(Collectors.joining(" "));
//				System.out.println(result);
	}
}
