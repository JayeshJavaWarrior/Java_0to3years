package streamsStrings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FirstDemo {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("india", "usa", "uk", "japan");

		names.stream().map(i -> i.toUpperCase()).toList().forEach(i -> System.out.println(i));

		names.stream().mapToInt(i -> i.length()).forEach(i -> System.out.println(i));

		List<String> namesq = names.stream().map(p -> p.substring(0, 1).toUpperCase() + p.substring(1))
				.collect(Collectors.toList());
		System.out.println(namesq);

	}

}
