package streamsIntegers;

import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		//	//  Find Second Highest Number in Array
		int[] numbers = { 5, 9, 11, 2, 8, 21, 29, 1 };
		
		//Stream<Integer>stream=
				
				Stream<Integer> Data = IntStream.of(numbers).boxed();
		Optional<Integer> secondHighestNumber = Data.sorted(Collections.reverseOrder()).skip(1).findFirst();
		secondHighestNumber.ifPresent(s -> System.out.println("Second highest number: " + s));

	     
	}

}
