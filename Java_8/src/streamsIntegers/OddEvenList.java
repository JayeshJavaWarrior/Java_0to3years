package streamsIntegers;

import java.util.*;
import java.util.stream.Collectors;

public class OddEvenList {
	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);

		// Separate odd numbers
		List<Integer> oddNumbers = myList.stream().filter(num -> num % 2 != 0) // Filtering odd numbers
				.collect(Collectors.toList());

		// Separate even numbers
		List<Integer> evenNumbers = myList.stream().filter(num -> num % 2 == 0) // Filtering even numbers
				.collect(Collectors.toList());

		// Printing the separated lists
		System.out.println("Odd Numbers: " + oddNumbers); // Output: [15, 49, 25]
		System.out.println("Even Numbers: " + evenNumbers); // Output: [10, 8, 98, 32]
	}
}
