package streamsStrings;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListOfString {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "and", "china", "bankok", "apple",
				"banana");

		List<String> WO = words.stream().map(e -> e.toUpperCase()).collect(Collectors.toList());
		System.out.println("UpperCase" + WO);

		List<String> Sortstring = words.stream().map(e -> e.toUpperCase()).sorted().distinct()
				.collect(Collectors.toList());
		System.out.println("Sortstring " + Sortstring);

		List<String> LenghtGreatenrThan = words.stream().map(e -> e.toUpperCase()).sorted().distinct()
				.filter(s -> s.length() >= 5).toList();
		System.out.println("LenghtGreaterThan=5" + LenghtGreatenrThan);

		List<String> RemoveDuplicate = words.stream().distinct().toList();
		System.out.println("RemoveDuplicate" + RemoveDuplicate);

		List<String> FilterByWprd = words.stream().distinct().filter(p -> p.contains("date")).toList();
		System.out.println("FilterByWprd" + FilterByWprd);

		List<String> RemoveString = words.stream().distinct().filter(p -> !p.startsWith("a")).toList();
		System.out.println("RemoveString" + RemoveString);

		List<String> strtswith = words.stream().distinct().filter(p -> p.startsWith("a")).toList();
		System.out.println("strtswith a" + strtswith);

		List<Integer> LengthOfEachWord = words.stream().map(p -> p.length()).toList();
		System.out.println("LengthOfEachWord a" + LengthOfEachWord);

		System.out.println("Sort the ListOfstring acending desc");
		words.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);
		// findTheLongestWord

		Optional<String> findTheLongestWord = words.stream().max(Comparator.comparing(String::length));

		findTheLongestWord.ifPresent(str -> System.out.println(str.toUpperCase()));

		List<String> wordsHavingVowels = words.stream().filter(str -> str.matches(".* [aeiou]*.")).toList();
		System.out.println("wordsHavingVowels " + wordsHavingVowels);

		// Convertlist into single word
		String list = words.stream().distinct().collect(Collectors.joining(","));
		System.out.println("list " + list);

		// reverse list of string
		List<StringBuffer> listofstring = words.stream().map(str -> new StringBuffer(str).reverse()).distinct()
				.toList();

		System.out.println("Reverse;;;;;;;;listofstring " + listofstring);

		// Group list of string by firstletter of each String
		Map<Character, List<String>> mapword = words.stream().collect(Collectors.groupingBy(str -> str.charAt(0)));

		mapword.forEach((key, liststr) -> {
			System.out.println("Group list of string by firstletter of each String  " + key + " = " + liststr);
		});

		// Group list of string by length String
		Map<Integer, List<String>> mapword1 = words.stream().collect(Collectors.groupingBy(String::length));

		mapword1.forEach((key1, listr) -> {
			System.out.println("Group list of string by length String  " + key1 + " = " + listr);

		});
		// create a map where the key is the last letter of the string,
		// and the value is a list of strings that end with that letter using streams
		Map<Character, List<String>> mapword3 = words.stream()
				.collect(Collectors.groupingBy(str -> str.charAt(str.length() - 1)));
		mapword3.forEach((key3, stl) -> {
			System.out.println("key is the last letter  " + key3 + " = " + stl);
		});

		List<String> FirstLttrCapital = words.stream().distinct()
				.map(p -> p.substring(0, 1).toUpperCase() + p.substring(1)).collect(Collectors.toList());
		System.out.println(FirstLttrCapital);

	}

}
