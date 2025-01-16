package streamsStrings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Flatmaps {

	public static void main(String[] args) {

		List<String> javacourses = Arrays.asList("core java", "adv java", "springboot");

		List<String> uicourses = Arrays.asList("html", "css", "bs", "js");

		List<List<String>> courses = Arrays.asList(javacourses, uicourses);

		courses.stream().flatMap(s -> s.stream()).forEach(s -> System.out.println(s));

		System.out.println("ashok sir startsnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");

		Stream<String> fm = courses.stream().flatMap(s -> s.stream());
		fm.forEach(s -> System.out.println(s));
	}

}
