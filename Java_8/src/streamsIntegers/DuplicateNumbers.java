package streamsIntegers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumbers {

	public static void main(String[] args) {

		List<Integer> lists = Arrays.asList(5, 29, 21, 211, 2, 8, 21, 29, 1, 16, 44, 211, 2, 8);

		Set<Integer> dup = new HashSet<>();
		
		Set<Integer> duplicates = lists.stream().filter(e -> !dup.add(e)).collect(Collectors.toSet());

		System.out.println("Duplicate numbers: " + duplicates);
		List<Integer> listss=lists.stream().distinct().toList();
		System.out.println("non numbers: " + listss);
		Optional<Integer> sum=listss.stream().reduce((a, b) -> a + b);
		
		System.out.println("sum: " + sum);
		// Duplicate numbers: [2, 8, 211, 21, 29]
		
		
	

	}

}
