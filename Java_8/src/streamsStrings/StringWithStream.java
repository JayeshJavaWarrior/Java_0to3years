package streamsStrings;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringWithStream {

	public static void main(String[] args) {

		String str = "ilovejavatechie";
		String[] splitStr = str.split("");
		Stream<String> stream = Arrays.stream(splitStr);
		// Example 2: Count Occurrences of Each Character in a String
		System.out.println("Count Occurrences of Each Character in a String");
		Arrays.stream(splitStr).collect(Collectors.groupingBy(Function.identity(),
		  Collectors.counting())) .forEach((character, count) ->
		  System.out.println(character + " - " + count));
		System.out.println("Find All Duplicate Elements in a String");
		  // Example 3: Find All Duplicate Elements in a String
		  
		Arrays.stream(splitStr).collect(Collectors.groupingBy(s -> s)) .forEach((character, count) ->
		  System.out.println(character + " - " + count));
		 
		System.out.println("Find All Non-Repeat Elements in a String");
		// 4)Find All Non-Repeat Elements in a String
		Map<String, Long> occurStr = Arrays.stream(splitStr)
				.collect(Collectors.groupingBy(p -> p, Collectors.counting()));
		Arrays.stream(splitStr).filter(f -> occurStr.get(f) == 1).forEach(p -> System.out.println(p + ","));
		// Example 5: Find First Non-Repeat Element in a String
		
		System.out.println("Find First Non-Repeat Element in a String");
		Map<String, Long> occurStr1 = Arrays.stream(splitStr)
				.collect(Collectors.groupingBy(p -> p, Collectors.counting()));
		Optional<String> Firstes = Arrays.stream(splitStr).filter(p -> occurStr1.get(p) == 1).findFirst();
		System.out.println(Firstes.get());
	}

}
