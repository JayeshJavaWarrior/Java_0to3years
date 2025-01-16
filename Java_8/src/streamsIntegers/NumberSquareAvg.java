package streamsIntegers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberSquareAvg {
	public static void main(String[] args) {
		List<Integer> lists = Arrays.asList(5, 9, 11, 2, 8, 21, 29, 1);
		Double avg = lists.stream().map(e -> e * e)
				// .filter(e -> e > 100)
				.mapToInt(e -> e).average().getAsDouble();

		System.out.println("NumberSquareAvg: " + avg);
///////////////////////////////////////////////////////////////////////////////////////////////////////////
		double averageSquare = lists.stream().map(n -> n * n) // Square each number
				.collect(Collectors.averagingDouble(n -> n)); // Calculate the average

		System.out.println("The average of the squares is: " + averageSquare);

	}
}
