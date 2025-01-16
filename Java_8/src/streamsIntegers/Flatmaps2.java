package streamsIntegers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Flatmaps2 {

	public static void main(String[] args) {
		List<List<Integer>> listOfLists = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5),
				Arrays.asList(6, 7, 8, 9));

		Stream<Integer> vc = listOfLists.stream().flatMap(s -> s.stream());
		// Stream<String> fm = courses.stream().flatMap(s -> s.stream());
		vc.forEach(s -> System.out.println(s));
		
		
		List<Integer> flattenedList = listOfLists.stream()
                .flatMap(List::stream)  // Flatten the inner lists
                .collect(Collectors.toList());  // Collect the result into a list

System.out.println(flattenedList);

	}

}
