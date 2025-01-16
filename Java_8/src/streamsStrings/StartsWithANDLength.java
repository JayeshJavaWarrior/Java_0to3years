package streamsStrings;

import java.util.Arrays;
import java.util.List;

public class StartsWithANDLength {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Ashok", "Anil", "Raju", "Rani", "John", "Akash", "Charles");

		// print name with its length which are starting with 'A' using Stream API
		// Ashok - 5
		// Anil - 4
		// Akash - 5
		names.stream().filter(i -> i.startsWith("A")).map(i -> i + "-" + i.length())
				.forEach(i -> System.out.println(i));

	}

}
