package streamsIntegers;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfNumbers {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(5, 9, 11, 2, 8, 21, 29, 1);

		Optional<Integer> sum = list.stream().reduce((a, b) -> a + b);

		if (sum.isPresent()) {
			System.out.println("SumOfNumbers: " + sum.get());
		}
	}

}
